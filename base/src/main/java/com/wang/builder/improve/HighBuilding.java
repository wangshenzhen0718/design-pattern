package com.wang.builder.improve;

public class HighBuilding extends HouseBuilder{
    public void buildBasic() {
        System.out.println("高级房子打地基100米");
    }

    public void buildWall() {
        System.out.println("高级房子砌墙20cm");

    }

    public void roofed() {
        System.out.println("高级房子封顶");
    }
}
