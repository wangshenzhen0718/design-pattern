package com.wang.bridge;

public class Client {
    public static void main(String[] args) {

        UprightPhone uprightPhone = new UprightPhone(new Xiaomi());
        uprightPhone.open();
        uprightPhone.close();
        uprightPhone.call();
        FoldPhone foldPhone = new FoldPhone(new Xiaomi());
        System.out.println("--------------------------------------------------------------");
        foldPhone.open();
        foldPhone.close();
        foldPhone.call();
    }
}
