package com.wang.p2_abstract_factory.pattern;

import java.lang.reflect.Proxy;

public class ProxyUtil {

    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),new JDKInvocationHandler(target));
    }
}
