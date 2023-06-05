package com.wang.p1_factory.pattern;

import java.util.Map;

public interface ICommodity {
    void sendCommodity(String uid, String commodityId, String bizId, Map<String,String> extMap);
}
