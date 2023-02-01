package com.wang.bridge;

public class Vivo implements Brand {
    public void open() {
        System.out.println("VIVO手机开机");
    }

    public void close() {
        System.out.println("VIVO手机关机");

    }

    public void call() {
        System.out.println("VIVO手机打电话");

    }
}
