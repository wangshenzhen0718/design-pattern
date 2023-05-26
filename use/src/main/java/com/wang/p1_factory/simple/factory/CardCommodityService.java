package com.wang.p1_factory.simple.factory;

import com.alibaba.fastjson.JSON;
import com.wang.p1_factory.simple.old.design.card.IQiYiCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class CardCommodityService implements ICommodity{
    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    private IQiYiCardService iCardService=new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iCardService.grantToken(mobile,bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }
    private String queryUserMobile(String uId) {
        return "18322456791";
    }
}
