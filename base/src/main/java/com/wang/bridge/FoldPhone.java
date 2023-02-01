package com.wang.bridge;

public class FoldPhone extends Phone{
    public FoldPhone(Brand brand) {
        super(brand);
    }
    public void open(){
        System.out.println("折叠手机开机");
        super.open();
    }
    public void close(){
        System.out.println("折叠手机关机");
        super.close();
    }
    public void call(){
        System.out.println("折叠手机通话中");
        super.call();
    }
}
