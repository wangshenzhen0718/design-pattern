package com.wang.p2_abstract_factory.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * @Author:wsz
 * @Date: 2023/6/6 22:23
 * @Description:抽象工厂模式：关注点在不通接口选择
 * @Version: 1.0
 * @Since: 1.0
 */
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
