package com.wang.p11_p11_flyweight.pattern;
/**
 * @Author:wsz
 * @Date: 2023/6/11 14:33
 * @Description:享元模式，主要在于共享通用对象，减少内存的使用，提升系统的访问效率。
 * 而这部分共享对象通常比较耗费内存或者需要查询大量接口或者使用数据库资源，因此统一抽离作为共享对象使用。
 * @Version: 1.0
 * @Since: 1.0
 */
public class ActivityController {

    private RedisUtils redisUtils = new RedisUtils();

    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        // 模拟从Redis中获取库存变化信息
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }

}