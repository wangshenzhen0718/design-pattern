package com.wang.builder.improve;

public class CommonHouse extends HouseBuilder{
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
        house.setBasic("测试");
    }

    public void buildWall() {
        System.out.println("普通房子砌墙10cm");

    }

    public void roofed() {
        System.out.println("普通房子封顶");
        StringBuilder stringBuilder = new StringBuilder();

    }
}
