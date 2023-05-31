package com.wang.p5_adapter.design;

import com.alibaba.fastjson.JSON;
import com.wang.p5_adapter.old.mq.OrderMq;


public class OrderMqService {

    public void onMessage(String message) {

        OrderMq mq = JSON.parseObject(message, OrderMq.class);

        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        // ... 处理自己的业务
    }

}
