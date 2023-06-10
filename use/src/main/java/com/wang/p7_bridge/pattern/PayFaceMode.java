package com.wang.p7_bridge.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PayFaceMode implements IPayMode {
  protected Logger logger = LoggerFactory.getLogger(PayFaceMode.class);

  @Override
  public boolean security(String uId) {
    logger.info("人脸支付，风控校验脸部识别");
    return true;
  }
}
