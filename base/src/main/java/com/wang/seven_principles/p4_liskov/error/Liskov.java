package com.wang.seven_principles.p4_liskov.error;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.function1(11,3));
        System.out.println("1-8="+a.function1(1,8));

        System.out.println("---------------------------------------");
        B b = new B();
        //这里本意是求出11-3
        System.out.println("11-3="+b.function1(11,3));
        System.out.println("1-8="+b.function1(1,8));
        System.out.println("11+3+9="+b.function2(11,3));


    }
}
