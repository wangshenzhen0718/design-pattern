package com.wang.p1_factory.factory_method.old_2;

import java.util.concurrent.TimeUnit;

public interface CacheService {

    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);

}
