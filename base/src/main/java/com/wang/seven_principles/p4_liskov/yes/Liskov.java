package com.wang.seven_principles.p4_liskov.yes;


/**
 * @Author wsz
 * @Description 基本介绍
 * <p>
 * 1) 里氏替换原则(Liskov Substitution Principle)在1988年，由麻省理工学院的以为姓里 的女士提出的。
 * 2) 如果对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序 P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1 的子类型。换句话说，所有引用基类的地方必须能透明地使用其子类的对象。
 * 3) 在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法
 * 4) 里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可 以通过聚合，组合，依赖 来解决问题。
 * @Date 2023/5/24
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.function1(11, 3));
        System.out.println("1-8=" + a.function1(1, 8));

        System.out.println("---------------------------------------");
        B b = new B();
        //这里本意是求出11-3
        System.out.println("11+3=" + b.function1(11, 3));
        System.out.println("1+8=" + b.function1(1, 8));
        System.out.println("11+3+9=" + b.function2(11, 3));

        //使用组合仍然可以使用到A类相关方法
        // 这里本意是求出11-3
        System.out.println("11-3=" + b.function3(11, 3));


    }
}
