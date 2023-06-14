package com.wang;

import com.alibaba.fastjson.JSON;
import com.wang.p18_observer.design.LotteryResult;
import com.wang.p18_observer.pattern.service.LotteryService;
import com.wang.p18_observer.pattern.service.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class P18_Observer {
  protected Logger logger = LoggerFactory.getLogger(P18_Observer.class);

  @Test
  public void test() {
    LotteryService lotteryService = new LotteryServiceImpl();
    LotteryResult result = lotteryService.draw("2765789109876");
    logger.info("测试结果：{}", JSON.toJSONString(result));
  }
}
