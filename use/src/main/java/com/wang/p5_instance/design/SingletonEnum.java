package com.wang.p5_instance.design;
/**
 * @Author:wsz
 * @Date: 2023/6/8 21:49
 * @Description:枚举单例
 * @Version: 1.0
 * @Since: 1.0
 */
public class SingletonEnum {

  private SingletonEnum() {}

  public enum SingletonEnumType {
    INSTANCE;
    private SingletonEnum instance = null;

    private SingletonEnumType() {
      instance = new SingletonEnum();
    }

    public SingletonEnum getInstance() {
      return instance;
    }
  }
}
