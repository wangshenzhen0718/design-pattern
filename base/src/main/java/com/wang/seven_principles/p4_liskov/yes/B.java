package com.wang.seven_principles.p4_liskov.yes;

public class B extends Base {

    /**
     * 解决方法
     * 1) 我们发现原来运行正常的相减功能发生了错误。原因就是类B无意中重写了父类的 方法，造成原有功能出现错误。在实际编程中，
     * 我们常常会通过重写父类的方法完 成新的功能，这样写起来虽然简单，但整个继承体系的复用性会比较差。特别是运 行多态比较频繁的时候
     * 2) 通用的做法是：原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉， 采用依赖，聚合，组合等关系代替.
     */
    //如果B需要使用A类的方法,使用组合关系
    private A a = new A();

    public int function1(int num1, int num2) {
        return num1 + num2;
    }

    public int function2(int num1, int num2) {
        return function1(num1, num2) + 9;
    }

    public int function3(int num1, int num2) {
        return this.a.function1(num1, num2);
    }
}
