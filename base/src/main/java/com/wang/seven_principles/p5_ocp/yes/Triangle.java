package com.wang.seven_principles.p5_ocp.yes;


//新增画三角形
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}