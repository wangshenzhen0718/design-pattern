package com.wang.p1_factory.pattern;

import com.wang.p1_factory.pattern.impl.CardCommodityService;
import com.wang.p1_factory.pattern.impl.CouponCommodityService;
import com.wang.p1_factory.pattern.impl.GoodsCommodityService;

/**
 * @Author:wsz
 * @Date: 2023/6/6 22:24
 * @Description:工厂方法模式：在父类中提供一个创建对象的方法， 允许子类决定实例化对象的类型。
 * @Version: 1.0
 * @Since: 1.0
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null==commodityType)return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");

    }
}
