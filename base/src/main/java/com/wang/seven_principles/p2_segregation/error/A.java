package com.wang.seven_principles.p2_segregation.error;

class A {
    //A 类通过接口Interface1 依赖(使用) B类，但是只会用到1,2,3方法
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation2();
    }

    public void depend3(Interface1 i) {
        i.operation3();
    }

}