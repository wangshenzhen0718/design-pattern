package com.wang;

import com.wang.p2_builder.pattern.Builder;
import org.junit.Test;

import java.math.BigDecimal;

public class P3_Builder {

  @Test
  public void test_Builder() {
    Builder builder = new Builder();
    // 豪华欧式
    System.out.println(builder.levelOne(new BigDecimal(132.52)).getDetail());
    // 轻奢田园
    System.out.println(builder.levelTwo(new BigDecimal(98.25)).getDetail());
    // 现代简约
    System.out.println(builder.levelThree(new BigDecimal(85.43)).getDetail());
  }
}
