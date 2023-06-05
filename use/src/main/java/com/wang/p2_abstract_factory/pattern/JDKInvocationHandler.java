package com.wang.p2_abstract_factory.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKInvocationHandler implements InvocationHandler {

  private Object delegate;

  public JDKInvocationHandler(Object target) {
    this.delegate = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object invoke = method.invoke(delegate, args);
    return invoke;
  }
}
