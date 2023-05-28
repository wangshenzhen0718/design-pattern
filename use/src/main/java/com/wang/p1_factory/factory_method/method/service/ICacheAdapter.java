package com.wang.p1_factory.factory_method.method.service;

import java.util.concurrent.TimeUnit;

/**
 * @Author wsz
 * @Description 抽象工厂模式，所要解决的问题就是在一个产品族，存在多个不同类型的产品(Redis集群、操作系统)情况下，接口选择的问题。
 * @Date 2023/5/28
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}