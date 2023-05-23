package com.wang.seven_principles.p3_inversion.yes;


public class Person {

    void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());

    }
}
