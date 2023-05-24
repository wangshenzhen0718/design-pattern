package com.wang.seven_principles.p6_demeter.error;

/**
 * @Author wsz
 * @Description
 * 1) 一个对象应该对其他对象保持最少的了解
 * 2) 类与类关系越密切，耦合度越大
 * 3) 迪米特法则(Demeter Principle)又叫最少知道原则，即一个类对自己依赖的类知道的 越少越好。也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内 部。对外除了提供的public 方法，不对外泄露任何信息
 * 4) 迪米特法则还有个更简单的定义：只与直接的朋友通信
 * 5) 直接的朋友：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系， 我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖，关联，组合，聚合 等。其中，我们称出现成员变量，方法参数，方法返回值中的类为直接的朋友，而 出现在局部变量中的类不是直接的朋友。也就是说，陌生的类最好不要以局部变量 的形式出现在类的内部
 * @Date 2023/5/24
 */
public class Demeter {
    public static void main(String[] args) {
        //创建了一个 SchoolManager 对象
        SchoolManager schoolManager = new SchoolManager();
        //输出学院的员工id 和  学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());


    }
}