package io.faob.utopian.handlers;

public interface ResponseHandler<T> {
    void handleResponse(T r);
}
