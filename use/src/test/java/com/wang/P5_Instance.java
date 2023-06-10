package com.wang;

import com.wang.p5_instance.design.SingletonDcl;
import com.wang.p5_instance.design.SingletonEnum;
import com.wang.p5_instance.design.SingletonInner;
import org.junit.Test;

public class P5_Instance {
  @Test
  public void test_instanceInner() {

    SingletonInner instance = SingletonInner.getInstance();
    SingletonInner instance2 = SingletonInner.getInstance();
    System.out.println(instance == instance2);
  }

  @Test
  public void test_instanceEnum() {
    SingletonEnum instance = SingletonEnum.SingletonEnumType.INSTANCE.getInstance();
    SingletonEnum instance2 = SingletonEnum.SingletonEnumType.INSTANCE.getInstance();
    System.out.println(instance == instance2);
  }

  @Test
  public void test_instanceDcl() {
    SingletonDcl instance = SingletonDcl.getInstance();
    SingletonDcl instance2 = SingletonDcl.getInstance();
    System.out.println(instance == instance2);
  }
}
