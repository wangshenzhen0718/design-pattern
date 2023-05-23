package com.wang.seven_principles.p3_inversion.improve.first;

public class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}
