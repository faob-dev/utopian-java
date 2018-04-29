package io.faob.utopian.service;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import io.faob.utopian.http.HttpManager;
import io.faob.utopian.http.HttpManagerImpl;
import io.faob.utopian.model.*;
import io.faob.utopian.type.ArrayType;
import io.faob.utopian.type.ObjectType;
import io.faob.utopian.type.TypeMapper;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultUtopianService implements UtopianService {

    @Override
    public ArrayType<Moderator> moderators() {
        TypeMapper<JsonArray> asJsonArray = jsonString -> {
            JsonObject moderatorsJson = new JsonParser().parse(jsonString).getAsJsonObject();
            return moderatorsJson.get("results").getAsJsonArray();
        };

        TypeMapper<List<Moderator>> asList = jsonString -> {
            Type collectionType = new TypeToken<List<Moderator>>(){}.getType();
            return new Gson().fromJson(asJsonArray.map(jsonString), collectionType);
        };

        return new ArrayType<>(ENDPOINT_MODERATORS, asJsonArray, asList);
    }

    @Override
    public ArrayType<Sponsor> sponsors() {
        TypeMapper<JsonArray> asJsonArray = jsonString -> {
            JsonObject sponsorsJson = new JsonParser().parse(jsonString).getAsJsonObject();
            return sponsorsJson.get("results").getAsJsonArray();
        };

        TypeMapper<List<Sponsor>> asList = jsonString -> {
            Type collectionType = new TypeToken<List<Sponsor>>(){}.getType();
            return new Gson().fromJson(asJsonArray.map(jsonString), collectionType);
        };

        return new ArrayType<>(ENDPOINT_SPONSORS, asJsonArray, asList);
    }

    @Override
    public ObjectType<Stats> stats() {
        TypeMapper<JsonObject> asJsonObject = jsonString -> {
            JsonObject statsJson = new JsonParser().parse(jsonString).getAsJsonObject();
            return statsJson.get("stats").getAsJsonObject();
        };

        TypeMapper<Stats> asObject = jsonString -> new Gson().fromJson(asJsonObject.map(jsonString), Stats.class);

        return new ObjectType<>(ENDPOINT_STATS, asJsonObject, asObject);
    }

    @Override
    public ObjectType<Moderator> moderator(String userName) {
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

        TypeMapper<Moderator> asObject = jsonString -> new Gson().fromJson(asJsonObject.map(jsonString), Moderator.class);

        return new ObjectType<>(ENDPOINT_MODERATORS, asJsonObject, asObject);
    }

    @Override
    public ObjectType<Sponsor> sponsor(String userName) {
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

        TypeMapper<Sponsor> asObject = jsonString -> new Gson().fromJson(asJsonObject.map(jsonString), Sponsor.class);

        return new ObjectType<>(ENDPOINT_SPONSORS, asJsonObject, asObject);
    }

    @Override
    public ArrayType<Post> posts(Map<String, Object> options) {
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

        TypeMapper<JsonArray> asJsonArray = jsonString -> {
            JsonObject postsJson = new JsonParser().parse(jsonString).getAsJsonObject();
            return postsJson.get("results").getAsJsonArray();
        };

        TypeMapper<List<Post>> asList = jsonString -> {
            Type collectionType = new TypeToken<List<Post>>(){}.getType();
            return new Gson().fromJson(asJsonArray.map(jsonString), collectionType);
        };

        return new ArrayType<>(url.toString(), asJsonArray, asList);
    }

    @Override
    public ArrayType<Project> topProjects(Map<String, Object> options) {
        if (options == null)
            options = new HashMap<>();

        StringBuilder url = new StringBuilder(ENDPOINT_POSTS_TOP + "/?");
        for (Map.Entry<String, Object> entry : options.entrySet()) {
            url.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        url = new StringBuilder(url.substring(0, url.length() - 1));

        TypeMapper<JsonArray> asJsonArray = jsonString -> new JsonParser().parse(jsonString).getAsJsonArray();

        TypeMapper<List<Project>> asList = jsonString -> {
            Type collectionType = new TypeToken<List<Project>>(){}.getType();
            return new Gson().fromJson(jsonString, collectionType);
        };

        return new ArrayType<>(url.toString(), asJsonArray, asList);
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
    public ObjectType<Post> post(String userName, String permLink) {
        String url = ENDPOINT_POSTS + "/" + userName + "/" + permLink;
        TypeMapper<JsonObject> asJsonObject = jsonString -> new JsonParser().parse(jsonString).getAsJsonObject();

        TypeMapper<Post> asObject = jsonString -> new Gson().fromJson(jsonString, Post.class);

        return new ObjectType<>(url, asJsonObject, asObject);
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
    public ArrayType<Post> postsByAuthor(String userName, Map<String, Object> options) {
        if (options == null)
            options = new HashMap<>();

        if (!options.containsKey("limit") || (int) options.get("limit") < 1 || (int) options.get("limit") > 50)
            options.put("limit", 50);

        if (!options.containsKey("skip") || (int) options.get("skip") < 0)
            options.put("skip", 0);

        options.put("section", "author");
        options.put("author", userName);

        return posts(options);
    }

    @Override
    public ArrayType<Post> postsByGithubProject(String repoName, Map<String, Object> options) {
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