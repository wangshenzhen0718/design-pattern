package com.wang.principle.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

    }
}
class RoadVehicle{

    public void run(String roadVehicle){
        System.out.println(roadVehicle+"\t 在陆地跑！！！");
    }
}


class AirVehicle{

    public void run(String airVehicle){
        System.out.println(airVehicle+"\t 在天空飞！！！");
    }
}