package com.wang.p1_factory.pattern;

import com.wang.p1_factory.pattern.impl.CardCommodityService;
import com.wang.p1_factory.pattern.impl.CouponCommodityService;
import com.wang.p1_factory.pattern.impl.GoodsCommodityService;

public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null==commodityType)return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");

    }
}
