package com.wang.seven_principles.p2_segregation.error;

public class Segregation1 {

    public static void main(String[] args) {


        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());




    }
}