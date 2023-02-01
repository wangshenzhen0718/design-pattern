package com.wang.adapter.adapterclass;

public class VoltageAdapter extends Voltage220V implements Voltage5V{
    public int get5V() {
        int src = get220();
        int dis=src/44;
        return dis;
    }
}
