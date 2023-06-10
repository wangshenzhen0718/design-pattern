package com.wang;

import com.alibaba.fastjson.JSON;
import com.wang.p6_adapter.design.OrderMq;
import com.wang.p6_adapter.design.create_account;
import com.wang.p6_adapter.pattern.*;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;

public class P6_Adapter {

  @Test
  public void test_Adapter()
      throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
    create_account create_account = new create_account();
    create_account.setNumber("100001");
    create_account.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
    create_account.setAccountDate(new Date());
    create_account.setDesc("在校开户");

    HashMap<String, String> link01 = new HashMap<>();
    link01.put("userId", "number");
    link01.put("bizId", "number");
    link01.put("bizTime", "accountDate");
    link01.put("desc", "desc");
    RebateInfo rebateInfo01 = MQAdapter.filter(create_account.toString(), link01);
    System.out.println("mq.create_account(适配前)" + create_account);
    System.out.println("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo01));

    System.out.println("");

    OrderMq orderMq = new OrderMq();
    orderMq.setUid("100001");
    orderMq.setSku("10928092093111123");
    orderMq.setOrderId("100000890193847111");
    orderMq.setCreateOrderTime(new Date());

    HashMap<String, String> link02 = new HashMap<String, String>();
    link02.put("userId", "uid");
    link02.put("bizId", "orderId");
    link02.put("bizTime", "createOrderTime");
    RebateInfo rebateInfo02 = MQAdapter.filter(orderMq.toString(), link02);

    System.out.println("mq.orderMq(适配前)" + orderMq.toString());
    System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(rebateInfo02));
  }

  @Test
  public void test_itfAdapter() {
    OrderAdapterService popOrderAdapterService = new POPOrderAdapterServiceImpl();
    System.out.println("判断首单，接口适配(POP)：" + popOrderAdapterService.isFirst("100001"));

    OrderAdapterService insideOrderService = new InsideOrderServiceImpl();
    System.out.println("判断首单，接口适配(自营)：" + insideOrderService.isFirst("100001"));
  }
}
