package io.faob.utopian.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.faob.utopian.http.HttpManager;
import io.faob.utopian.type.ArrayType;
import io.faob.utopian.type.ObjectType;

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
     *
     * @return A reference to {@code ArrayType} object to select custom array return type.
     */
    ArrayType<JsonArray> moderators();


    /**
     * Returns all sponsors as {@link JsonArray}.
     *
     * @return A reference to {@code ArrayType} object to select custom array return type.
     */
    ArrayType<JsonArray> sponsors();

    /**
     * Returns all stats as {@link JsonObject}.
     *
     * @return A reference to {@code ObjectType} object to select custom object return type.
     */
    ObjectType<JsonObject> stats();

    /**
     * Returns moderator as {@link JsonObject} with given username otherwise empty {@link JsonObject}.
     *
     * @param userName Moderator username
     * @return A reference to {@code ObjectType} object to select custom object return type.
     */
    ObjectType<JsonObject> moderator(String userName);


    /**
     * Returns sponsor as {@link JsonObject} with given username otherwise empty {@link JsonObject}.
     *
     * @param userName Sponsor username
     * @return A reference to {@code ObjectType} object to select custom object return type.
     */
    ObjectType<JsonObject> sponsor(String userName);


    /**
     * Returns posts as {@link JsonArray} with given filter options.
     *
     * @param options Additional query options to customize results
     * @return A reference to {@code ArrayType} object to select custom array return type.
     */
    ArrayType<JsonArray> posts(Map<String, Object> options);


    /**
     * Returns top projects as {@link JsonArray} with given filter options.
     *
     * @param options Additional query options to customize results
     * @return A reference to {@code ArrayType} object to select custom array return type.
     */
    ArrayType<JsonArray> topProjects(Map<String, Object> options);


    /**
     * Returns total posts count as {@link Integer}.
     *
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<Integer> totalPostsCount();


    /**
     * Returns post {@link JsonObject} with given params.
     *
     * @param userName Author name
     * @param permLink Post permlink
     * @return A reference to {@code ObjectType} object to select custom object return type.
     */
    ObjectType<JsonObject> post(String userName, String permLink);


    /**
     * Returns post url as {@link String}.
     *
     * @param postId Id of post
     * @return A reference to {@code HttpManager} object to make http call.
     */
    HttpManager<String> postURL(String postId);


    /**
     * Returns list of posts as {@link JsonArray} with given author and filter options.
     *
     * @param userName Author username
     * @param options  Additional query options to customize results
     * @return A reference to {@code ArrayType} object to select custom array return type.
     */
    ArrayType<JsonArray> postsByAuthor(String userName, Map<String, Object> options);


    /**
     * Returns list of posts as {@link JsonArray} links with specified github repository and filter options.
     *
     * @param repoName Full github repository name i.e. square/okhttp
     * @param options  Additional query options to customize results
     * @return A reference to {@code ArrayType} object to select custom array return type.
     */
    ArrayType<JsonArray> postsByGithubProject(String repoName, Map<String, Object> options);

}
