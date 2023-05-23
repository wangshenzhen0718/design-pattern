package com.wang.seven_principles.p2_segregation.yes;
/**
 * @Author  wsz
 * @Description 客户端不应该依赖它不需要的接 口，即一个类对另一个类的依赖 应该建立在最小的接口上
 * @Date   2023/5/23
 */
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