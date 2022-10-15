package com.wang.principle.liskov.improve;

public class Liskov1 {
    public static void main(String[] args) {
        A a = new A();

        System.out.println("11-3=" + a.function1(11, 3));
        System.out.println("1-7=" + a.function1(1, 7));
        B b = new B();
        System.out.println("11-3=" + b.function1(11, 3));
        System.out.println("1-7=" + b.function1(1, 7));
    }
}

class Base {
}

class A extends Base {
    int function1(int a, int b) {
        return a - b;

    }
}

class B extends Base {
    private A a = new A();//组合

    public int function1(int a, int b) {
        return this.a.function1(a, b);
    }


}



