package io.faob.utopian.handlers;

/**
 * Functional interface used as lambda expression to handle successful response.
 *
 * @param <T> Response Type
 * @author FaoB
 */

public interface ResponseHandler<T> {
    void handleResponse(T r);
}
