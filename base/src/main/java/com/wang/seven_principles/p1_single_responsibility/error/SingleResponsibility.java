package com.wang.seven_principles.p1_single_responsibility.error;

/**
 * @Author wsz
 * @Description单一职责原则注意事项和细节
 * 1) 降低类的复杂度，一个类只负责一项职责。
 * 2) 提高类的可读性，可维护性
 * 3) 降低变更引起的风险
 * 4) 通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违 反单一职责原则；只有类中方法数量足够少，可以在方法级别保持单一职责原则
 * @Date 2023/5/23
 */
public class SingleResponsibility {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("飞机");
        vehicle.run("轮船");
        vehicle.run("摩托");

    }
}

class Vehicle {
    void run(String name) {
        System.out.println(name + "在公路上跑.............");
    }
}