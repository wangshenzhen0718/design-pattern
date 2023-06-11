package com.wang.p9_decorator.design;

public interface HandlerInterceptor {

  boolean preHandle(String request, String response, Object handler);
}
