# guava-cache-redis

Fork of https://github.com/levyfan/guava-cache-redis with updated dependencies and better error handling.

## Usage

Usage in gradle:

`build.gradle`
```
    repositories {
        maven { url 'https://jitpack.io' }
    }

    dependencies {
        implementation 'com.github.universal-development:guava-cache-redis:0.0.7'
    }
```

Java usage:
```
        GenericObjectPoolConfig<Jedis> jedisConfig = new GenericObjectPoolConfig<>();

        JedisPool jedisPool = new JedisPool(jedisConfig, address, port);

        redisCache = new RedisCache<>(
                jedisPool,
                new JdkSerializer(),
                new JdkSerializer(),
                "test-prefix".getBytes(StandardCharsets.UTF_8),
                666
        );
```
