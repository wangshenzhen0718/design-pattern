package com.wang.seven_principles.p3_inversion.yes;

public class Email implements IReceiver{

    @Override
    public String getInfo(){
        return "电子邮件信息: hello,world";
    }
}
