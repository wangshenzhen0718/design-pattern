package com.wang.p11_flyweight.pattern;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
 * @Author:wsz
 * @Date: 2023/6/11 14:32
 * @Description:生产商品的工厂
 * @Version: 1.0
 * @Since: 1.0
 */
public class ActivityFactory {

    static Map<Long, Activity> activityMap = new HashMap<Long, Activity>();

    public static Activity getActivity(Long id) {
        Activity activity = activityMap.get(id);
        if (null == activity) {
            // 模拟从实际业务应用从接口中获取活动信息
            activity = new Activity();
            activity.setId(10001L);
            activity.setName("图书嗨乐");
            activity.setDesc("图书优惠券分享激励分享活动第二期");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id, activity);
        }
        return activity;
    }

}