package com.wang.p18_observer.pattern.service;

import com.wang.p18_observer.design.LotteryResult;
import com.wang.p18_observer.design.MinibusTargetService;

import java.util.Date;

public class LotteryServiceImpl extends LotteryService {

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = minibusTargetService.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }

}