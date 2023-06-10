package com.wang.p6_adapter.pattern;

import com.wang.p6_adapter.design.service.POPOrderService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {

  private POPOrderService popOrderService = new POPOrderService();

  @Override
  public boolean isFirst(String uId) {
    return popOrderService.isFirstOrder(uId);
  }
}
