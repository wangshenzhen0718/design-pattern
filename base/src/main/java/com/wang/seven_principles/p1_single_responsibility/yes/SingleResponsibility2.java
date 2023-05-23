package com.wang.seven_principles.p1_single_responsibility.yes;

/**
 * @Author wsz
 * @Description 单一职责正确演示 一个类负责一个职责
 * @Date 2023/5/23
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("船");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");


    }
}

class WaterVehicle {

    void run(String name) {
        System.out.println(name + "在海里游.............");
    }
}

class AirVehicle {

    void run(String name) {
        System.out.println(name + "在天空飞.............");
    }
}

class RoadVehicle {

    void run(String name) {
        System.out.println(name + "在陆地跑.............");
    }
}