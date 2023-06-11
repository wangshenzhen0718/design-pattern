package com.wang;

import com.alibaba.fastjson.JSON;
import com.wang.p11_p11_flyweight.pattern.Activity;
import com.wang.p11_p11_flyweight.pattern.ActivityController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class P11_FlyWeight {
    private Logger logger = LoggerFactory.getLogger(P11_FlyWeight.class);

    private ActivityController activityController = new ActivityController();

    @Test
    public void test_queryActivityInfo() throws InterruptedException {
        for (int idx = 0; idx < 10; idx++) {
            Long req = 10001L;
            Activity activity = activityController.queryActivityInfo(req);
            logger.info("测试结果：{} {}", req, JSON.toJSONString(activity));
            Thread.sleep(1200);
        }
    }

}
