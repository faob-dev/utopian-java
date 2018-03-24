package io.faob.utopian.http;


/**
 * Manager that handles http related stuff.
 * <p>Calls can be executed synchronously with {@link #get}, or asynchronously (not implemented yet).
 *
 * @param <T> Successful response body type.
 * @author FaoB
 */

public interface HttpManager<T> {

    /**
     * Synchronously send the request and return its response.
     *
     * @return Response body type.
     * @throws Exception if a problem occurred talking to the server.
     */
    T get() throws Exception;
}
