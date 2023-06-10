package com.wang.p6_adapter.pattern;

import com.wang.p6_adapter.design.service.OrderService;

public class InsideOrderServiceImpl implements OrderAdapterService {
  private OrderService orderService = new OrderService();

  @Override
  public boolean isFirst(String uId) {
    return orderService.queryUserOrderCount(uId) <= 1;
  }
}
