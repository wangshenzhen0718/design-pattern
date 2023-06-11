package com.wang;

import com.wang.p9_decorator.design.SsoInterceptor;
import com.wang.p9_decorator.pattern.LoginSsoDecorator;
import org.junit.Test;

public class P9_Decorator {
  @Test
  public void test_Adapter() {
    LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
    String request = "1successhuahua";
    boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
    System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
  }
}
