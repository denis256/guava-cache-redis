package com.github.guava.cache.redis;

/**
 * Interface to serialize any object to byte array and deserialize it back
 */
public interface Serializer {

    byte[] serialize(final Object obj);

    <T> T deserialize(final byte[] objectData);
}
