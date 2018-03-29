package io.faob.utopian.http;


import io.faob.utopian.http.handlers.ErrorHandler;
import io.faob.utopian.http.handlers.ResponseHandler;

/**
 * Manager that handles http related stuff.
 * <p>Calls can be executed synchronously with {@link #get}, or asynchronously (not implemented yet).
 *
 * @param <T> Successful response body type.
 * @author FaoB
 */

public interface HttpManager<T> {

    /**
     * Synchronously sends request and return its response.
     *
     * @return Response body type.
     * @throws Exception if a problem occurred talking to the server.
     */
    T get() throws Exception;


    /**
     * Asynchronously sends request and notify {@code responseHandler} on response or
     * notify {@code errorHandler} when some error occurred.
     *
     * @param responseHandler This lambda expression gets called on response
     * @param errorHandler    This lambda expression gets called on error
     */
    void getAsync(ResponseHandler<T> responseHandler, ErrorHandler<Exception> errorHandler);
}
