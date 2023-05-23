package com.wang.seven_principles.p1_single_responsibility.error;

/**
 * @Author wsz
 * @Description
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