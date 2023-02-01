package com.wang.principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("火车");
        vehicle2.runAir("飞机");

    }
}
class Vehicle2{

    public void runRoad(String raodVehicle){
        System.out.println(raodVehicle+"\t 在公路上跑");

    }
    public void runAir(String airVehicle){
        System.out.println(airVehicle+"\t 在天上飞");

    }
}

