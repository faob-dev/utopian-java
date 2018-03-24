package io.faob.utopian.type;

/**
 * Functional interface used as lambda expression to map from one type to another.
 *
 * @param <T> New mapped type.
 * @author FaoB
 */

public interface TypeMapper<T> {

    /**
     * Map from {@link String} to another type.
     *
     * @param jsonString json as string.
     * @return new mapped type.
     */
    T map(String jsonString);
}