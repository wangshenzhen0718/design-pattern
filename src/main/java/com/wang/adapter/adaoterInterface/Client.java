package com.wang.adapter.adaoterInterface;

public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter(){

            @Override
            public void m1() {
                System.out.println("输出m1");
            }
        };
        absAdapter.m1();
    }
}
