package com.wang.seven_principles.p3_inversion.error;

public class Person {

    void receive(Email email) {
        System.out.println(email.getInfo());

    }
}
