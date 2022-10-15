package com.wang.principle.ocp.improve;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());

    }
}

abstract class Shape1{
 public abstract void draw();

}

class Rectangle extends Shape1 {
    public void draw() {
        System.out.println("绘制长方形");

    }
}

class Circle extends Shape1 {
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Triangle extends Shape1 {
    public void draw() {
        System.out.println("绘制三角形");
    }
}

class GraphicEditor{
    void drawShape(Shape1 shape){
        shape.draw();



    }


}
