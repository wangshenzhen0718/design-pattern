package com.wang.seven_principles.p1_single_responsibility.yes;

/**
 * @Author wsz
 * @Description 单一职责正确演示 一个方法负责一个职责
 * @Date 2023/5/23
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runAir("飞机");
        vehicle2.runRoad("跑车");
        vehicle2.runWater("轮船");


    }
}


class Vehicle2 {
    void runRoad(String name) {
        System.out.println(name + "在陆地跑......");
    }

    void runAir(String name) {
        System.out.println(name + "在天空飞......");
    }

    void runWater(String name) {
        System.out.println(name + "在海洋游......");
    }

}
