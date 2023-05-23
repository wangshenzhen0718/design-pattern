package com.wang.seven_principles.p3_inversion.improve.third;

public class OpenAndClose implements IOpenAndClose {
    public ITV itv;

    public void setItv(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
        this.itv.play();
    }

}
