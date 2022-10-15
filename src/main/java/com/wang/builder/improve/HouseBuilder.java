package com.wang.builder.improve;

public abstract class HouseBuilder {
    protected House house=new House();
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();
    public House buildHouse(){
        return house;
    }
}
