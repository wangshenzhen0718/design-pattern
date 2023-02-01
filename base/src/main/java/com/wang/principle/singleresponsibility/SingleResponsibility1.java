package com.wang.principle.singleresponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("火车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}
class Vehicle{

    public void run(String vehicle){
        System.out.println(vehicle+"\t 在跑！！！");


    }


        }