package com.wang.p5_instance.design;
/**
 * @Author:wsz
 * @Date: 2023/6/8 21:21
 * @Description:内部类
 * @Version: 1.0
 * @Since: 1.0
 */
public class SingletonInner {
  private SingletonInner() {}

  public static SingletonInner getInstance() {
    return SingletonHolder.instance;
  }

  private static class SingletonHolder {
    private static SingletonInner instance = new SingletonInner();
  }
}
