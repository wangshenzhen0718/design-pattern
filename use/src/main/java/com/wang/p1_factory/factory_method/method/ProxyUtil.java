package com.wang.p1_factory.factory_method.method;

import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Object newProxyInstance(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), 
                new JDKInvocationHandler(target));
    }
}