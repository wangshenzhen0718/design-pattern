package com.wang.seven_principles.p3_inversion.improve.second;

public class OpenAndClose implements IOpenAndClose {
    public ITV itv;

    public OpenAndClose(ITV tv) {
        this.itv = tv;

    }

    @Override
    public void open() {
        this.itv.play();
    }

}
