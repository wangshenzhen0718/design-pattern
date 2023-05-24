package com.wang.seven_principles.p4_liskov.error;

public class B extends A {
    @Override
    public int function1(int num1, int num2) {
        return num1 + num2;
    }

    public int function2(int num1, int num2) {
        return function1(num1, num2) + 9;
    }

}
