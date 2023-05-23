package com.wang.seven_principles.p3_inversion.yes;

public class Wechat implements IReceiver{
    @Override
    public String getInfo() {
        return "微信信息: hello,world";
    }
}
