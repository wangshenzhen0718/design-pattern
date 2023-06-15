package com.wang;

import com.alibaba.fastjson.JSON;
import com.wang.p19_status.design.ActivityService;
import com.wang.p19_status.design.Status;
import com.wang.p19_status.pattern.Result;
import com.wang.p19_status.pattern.StateHandler;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class P19_Status {
    protected Logger logger = LoggerFactory.getLogger(P19_Status.class);
    @Test
    public void test_Editing2Open() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);
        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.open(activityId, Status.Editing);
        logger.info("测试结果(编辑中To开启活动)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }
}
