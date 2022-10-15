package com.wang.adapter.adapterobject;

public class VoltageAdapter implements Voltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public int get5V() {
        int src = 0;
        if (voltage220V!=null){
            src = voltage220V.get220();

        }

        int dis=src/44;
        return dis;
    }
}
