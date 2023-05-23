package com.wang.seven_principles.p2_segregation.error;

class C {
    //C 类通过接口Interface1 依赖(使用) D类，但是只会用到1,4,5方法
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface1 i) {
        i.operation4();
    }

    public void depend5(Interface1 i) {
        i.operation5();
    }
}