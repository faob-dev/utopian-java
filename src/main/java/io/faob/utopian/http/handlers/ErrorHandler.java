package io.faob.utopian.http.handlers;

/**
 * Functional interface used as lambda expression to handle error.
 *
 * @param <E> Exception Type
 * @author FaoB
 */

public interface ErrorHandler<E> {
    void handleError(E e);
}
