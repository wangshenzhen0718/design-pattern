package com.wang.p9_decorator.pattern;

import com.wang.p9_decorator.design.HandlerInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * @Author:wsz @Date: 2023/6/11 10:32 @Description:
 * 实现AOP类似功能，主要是定义抽象类并继承接口中的方法，保证一致性，
 * 具体装饰角色(ConcreteDecorator) - 扩展装饰具体的实现逻辑
 * @Version: 1.0
 * @Since:
 * 1.0
 */
public class LoginSsoDecorator extends SsoDecorator {

  private static Map<String, String> authMap = new ConcurrentHashMap<>();

  static {
    authMap.put("huahua", "queryUserInfo");
    authMap.put("doudou", "queryUserInfo");
  }

  private Logger logger = LoggerFactory.getLogger(LoginSsoDecorator.class);

  public LoginSsoDecorator(HandlerInterceptor handlerInterceptor) {
    super(handlerInterceptor);
  }

  @Override
  public boolean preHandle(String request, String response, Object handler) {
    boolean success = super.preHandle(request, response, handler);
    if (!success) return false;
    String userId = request.substring(8);
    String method = authMap.get(userId);
    logger.info("模拟单点登录方法访问拦截校验：{} {}", userId, method);
    // 模拟方法校验
    return "queryUserInfo".equals(method);
  }
}
