package com.wang.principle.ocp;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());

    }
}
class Shape{
    int type;
}
class Rectangle extends Shape{
    Rectangle(){
        super.type=1;
    }
}

class Circle extends Shape{
    Circle(){
        super.type=2;
    }
}

class Triangle extends Shape{
     Triangle(){
        super.type=3;
    }
}
class GraphicEditor{
    void drawShape(Shape shape){
        if (shape.type==1)
        {
            drawRectangle();

        }
        else if (shape.type==2)
        {
            drawCircle();
        }
        else if (shape.type==3)
        {
            drawTriangle();
        }


    }

    void drawRectangle(){
        System.out.println("绘制矩形。。。。");

    }
    void drawCircle(){
        System.out.println("绘制圆形。。。。");

    }
    void drawTriangle(){
        System.out.println("绘制三角形。。。。");

    }
}
