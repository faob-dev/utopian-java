package io.faob.utopian.handlers;

public interface ErrorHandler<E> {
    void handleError(E e);
}
