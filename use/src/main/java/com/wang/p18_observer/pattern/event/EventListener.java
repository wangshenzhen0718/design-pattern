package com.wang.p18_observer.pattern.event;

import com.wang.p18_observer.design.LotteryResult;

public interface EventListener {

    void doEvent(LotteryResult result);

}
 