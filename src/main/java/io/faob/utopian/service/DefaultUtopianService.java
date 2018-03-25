package io.faob.utopian.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.faob.utopian.http.HttpManager;
import io.faob.utopian.http.HttpManagerImpl;
import io.faob.utopian.type.TypeMapper;

import java.util.HashMap;
import java.util.Map;

public class DefaultUtopianService implements UtopianService {

    @Override
    public HttpManager<JsonObject> moderators() {
        TypeMapper<JsonObject> asJsonObject = jsonString -> new JsonParser().parse(jsonString).getAsJsonObject();
        return new HttpManagerImpl<>(ENDPOINT_MODERATORS, asJsonObject);
    }

    @Override
    public HttpManager<JsonObject> sponsors() {
        TypeMapper<JsonObject> asJsonObject = jsonString -> new JsonParser().parse(jsonString).getAsJsonObject();
        return new HttpManagerImpl<>(ENDPOINT_SPONSORS, asJsonObject);
    }

    @Override
    public HttpManager<JsonObject> stats() {
        TypeMapper<JsonObject> asJsonObject = jsonString -> new JsonParser().parse(jsonString).getAsJsonObject();
        return new HttpManagerImpl<>(ENDPOINT_STATS, asJsonObject);
    }

    @Override
    public HttpManager<JsonObject> moderator(String userName) {
        TypeMapper<JsonObject> asJsonObject = jsonString -> {
            JsonObject moderators = new JsonParser().parse(jsonString).getAsJsonObject();
            JsonArray results = moderators.getAsJsonArray("results");
            for (JsonElement result : results) {
                JsonObject object = result.getAsJsonObject();
                String account = object.get("account").getAsString();
                boolean banned = object.get("banned").getAsBoolean();
                boolean reviewed = object.get("reviewed").getAsBoolean();

                if (account.equals(userName) && banned == false && reviewed == true) {
                    return object;
                }
            }
            return new JsonObject();
        };
        return new HttpManagerImpl<>(ENDPOINT_MODERATORS, asJsonObject);
    }

    @Override
    public HttpManager<JsonObject> sponsor(String userName) {
        TypeMapper<JsonObject> asJsonObject = jsonString -> {
            JsonObject sponsors = new JsonParser().parse(jsonString).getAsJsonObject();
            JsonArray results = sponsors.getAsJsonArray("results");
            for (JsonElement result : results) {
                JsonObject object = result.getAsJsonObject();
                String account = object.get("account").getAsString();
                if (account.equals(userName)) {
                    return object;
                }
            }
            return new JsonObject();
        };
        return new HttpManagerImpl<>(ENDPOINT_SPONSORS, asJsonObject);
    }

    @Override
    public HttpManager<JsonObject> posts(Map<String, Object> options) {
        if (options == null)
            options = new HashMap<>();

        if (!options.containsKey("limit") || (int) options.get("limit") < 1 || (int) options.get("limit") > 50)
            options.put("limit", 50);

        if (!options.containsKey("skip") || (int) options.get("skip") < 0)
            options.put("skip", 0);

        StringBuilder url = new StringBuilder(ENDPOINT_POSTS + "/?");
        for (Map.Entry<String, Object> entry : options.entrySet()) {
            url.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        url = new StringBuilder(url.substring(0, url.length() - 1));

        TypeMapper<JsonObject> asJsonObject = jsonString -> new JsonParser().parse(jsonString).getAsJsonObject();
        return new HttpManagerImpl<>(url.toString(), asJsonObject);
    }

    @Override
    public HttpManager<JsonArray> topProjects(Map<String, Object> options) {
        StringBuilder url = new StringBuilder(ENDPOINT_POSTS_TOP + "/?");
        for (Map.Entry<String, Object> entry : options.entrySet()) {
            url.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        url = new StringBuilder(url.substring(0, url.length() - 1));

        TypeMapper<JsonArray> asJsonObject = jsonString -> new JsonParser().parse(jsonString).getAsJsonArray();
        return new HttpManagerImpl<>(url.toString(), asJsonObject);
    }

    @Override
    public HttpManager<Integer> totalPostsCount() {
        String url = ENDPOINT_POSTS + "/?limit=1&skip=0";
        TypeMapper<Integer> asInt = jsonString -> {
            JsonObject jsonObject = new JsonParser().parse(jsonString).getAsJsonObject();
            return jsonObject.get("total").getAsInt();
        };
        return new HttpManagerImpl<>(url, asInt);
    }

    @Override
    public HttpManager<JsonObject> post(String userName, String permLink) {
        String url = ENDPOINT_POSTS + "/" + userName + "/" + permLink;
        TypeMapper<JsonObject> asJsonObject = jsonString -> new JsonParser().parse(jsonString).getAsJsonObject();
        return new HttpManagerImpl<>(url, asJsonObject);
    }

    @Override
    public HttpManager<String> postURL(String postId) {
        String url = ENDPOINT_POSTS + "/byid/" + postId;
        TypeMapper<String> asString = jsonString -> {
            JsonObject jsonObject = new JsonParser().parse(jsonString).getAsJsonObject();
            return "https://utopian.io" + jsonObject.get("url").getAsString();
        };
        return new HttpManagerImpl<>(url, asString);
    }

    @Override
    public HttpManager<JsonObject> postByAuthor(String userName, Map<String, Object> options) {
        if (options == null)
            options = new HashMap<>();

        if (!options.containsKey("limit") || (int) options.get("limit") < 1 || (int) options.get("limit") > 50)
            options.put("limit", 50);

        if (!options.containsKey("skip") || (int) options.get("skip") < 0)
            options.put("skip", 0);

        options.put("section", "author");
        options.put("author", userName);

        StringBuilder url = new StringBuilder(ENDPOINT_POSTS + "/?");
        for (Map.Entry<String, Object> entry : options.entrySet()) {
            url.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        url = new StringBuilder(url.substring(0, url.length() - 1));

        TypeMapper<JsonObject> asJsonObject = jsonString -> new JsonParser().parse(jsonString).getAsJsonObject();
        return new HttpManagerImpl<>(url.toString(), asJsonObject);
    }

    @Override
    public HttpManager<JsonObject> postsByGithubProject(String repoName, Map<String, Object> options) {
        String repoId = null;
        try {
            repoId = githubRepoIdByRepoName(repoName).get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (options == null)
            options = new HashMap<>();

        if (!options.containsKey("section"))
            options.put("section", "project");

        if (!options.containsKey("sortBy"))
            options.put("sortBy", "created");

        if (!options.containsKey("platform"))
            options.put("platform", "github");

        if (!options.containsKey("projectId"))
            options.put("projectId", repoId);

        if (!options.containsKey("type"))
            options.put("type", "all");

        return posts(options);
    }

    private HttpManager<String> githubRepoIdByRepoName(String repoName) {
        String url = GITHUB_REPO_URL + repoName;
        TypeMapper<String> asString = jsonString -> {
            JsonObject jsonObject = new JsonParser().parse(jsonString).getAsJsonObject();
            return jsonObject.get("id").getAsString();
        };
        return new HttpManagerImpl<>(url, asString);
    }

}