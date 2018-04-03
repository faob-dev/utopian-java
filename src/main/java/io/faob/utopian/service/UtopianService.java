package io.faob.utopian.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.faob.utopian.http.HttpManager;

import java.util.Map;


/**
 * Service shows various options available to interacts with Utopian service
 *
 * @author FaoB
 */

public interface UtopianService {
    String API_HOST = "https://api.utopian.io/api/";
    String ENDPOINT_MODERATORS = API_HOST + "moderators";
    String ENDPOINT_SPONSORS = API_HOST + "sponsors";
    String ENDPOINT_POSTS = API_HOST + "posts";
    String ENDPOINT_STATS = API_HOST + "stats";
    String ENDPOINT_POSTS_TOP = ENDPOINT_POSTS + "/top";
    String GITHUB_REPO_URL = "https://api.github.com/repos/";


    /**
     * Returns all moderators as {@link JsonArray}.
     * <p>
     * Note: After this method call you need to call {@code get()} to make http call and get response.
     * </p>
     *
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<JsonArray> moderators();


    /**
     * Returns all sponsors as {@link JsonArray}.
     * <p>
     * Note: After this method call you need to call {@code get()} to make http call and get response.
     * </p>
     *
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<JsonArray> sponsors();

    /**
     * Returns all stats as {@link JsonObject}.
     * <p>
     * Note: After this method call you need to call {@code get()} to make http call and get response.
     * </p>
     *
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<JsonObject> stats();

    /**
     * Returns moderator as {@link JsonObject} with given username otherwise empty {@link JsonObject}.
     * <p>
     * Note: After this method call you need to call {@code get()} to make http call and get response.
     * </p>
     *
     * @param userName Moderator username
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<JsonObject> moderator(String userName);


    /**
     * Returns sponsor as {@link JsonObject} with given username otherwise empty {@link JsonObject}.
     * <p>
     * Note: After this method call you need to call {@code get()} to make http call and get response.
     * </p>
     *
     * @param userName Sponsor username
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<JsonObject> sponsor(String userName);


    /**
     * Returns posts as {@link JsonArray} with given filter options.
     * <p>
     * Note: After this method call you need to call {@code get()} to make http call and get response.
     * </p>
     *
     * @param options Additional query options to customize results
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<JsonArray> posts(Map<String, Object> options);


    /**
     * Returns top projects as {@link JsonArray} with given filter options.
     * <p>
     * Note: After this method call you need to call {@code get()} to make http call and get response.
     * </p>
     *
     * @param options Additional query options to customize results
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<JsonArray> topProjects(Map<String, Object> options);


    /**
     * Returns total posts count as {@link Integer}.
     * <p>
     * Note: After this method call you need to call {@code get()} to make http call and get response.
     * </p>
     *
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<Integer> totalPostsCount();


    /**
     * Returns post {@link JsonObject} with given params.
     * <p>
     * Note: After this method call you need to call {@code get()} to make http call and get response.
     * </p>
     *
     * @param userName Author name
     * @param permLink Post permlink
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<JsonObject> post(String userName, String permLink);


    /**
     * Returns post url as {@link String}.
     * <p>
     * Note: After this method call you need to call {@code get()} to make http call and get response.
     * </p>
     *
     * @param postId Id of post
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<String> postURL(String postId);


    /**
     * Returns list of posts as {@link JsonArray} with given author and filter options.
     * <p>
     * Note: After this method call you need to call {@code get()} to make http call and get response.
     * </p>
     *
     * @param userName Author username
     * @param options  Additional query options to customize results
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<JsonArray> postsByAuthor(String userName, Map<String, Object> options);


    /**
     * Returns list of posts as {@link JsonArray} links with specified github repository and filter options.
     * <p>
     * Note: After this method call you need to call {@code get()} to make http call and get response.
     * </p>
     *
     * @param repoName Full github repository name i.e. square/okhttp
     * @param options  Additional query options to customize results
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<JsonArray> postsByGithubProject(String repoName, Map<String, Object> options);

}
