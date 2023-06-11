package com.wang.p9_decorator.pattern;

import com.wang.p9_decorator.design.HandlerInterceptor;

public abstract class SsoDecorator implements HandlerInterceptor {

  private HandlerInterceptor handlerInterceptor;

  private SsoDecorator() {}

  public SsoDecorator(HandlerInterceptor handlerInterceptor) {
    this.handlerInterceptor = handlerInterceptor;
  }

  public boolean preHandle(String request, String response, Object handler) {
    return handlerInterceptor.preHandle(request, response, handler);
  }
}
