package com.wang.seven_principles.p5_ocp.yes;

/**
 * @Author wsz
 * @Description 基本介绍
 * 1) 开闭原则（Open Closed Principle）是编程中最基础、最重要的设计原则
 * 2) 一个软件实体如类，模块和函数应该对扩展开放(对提供方)，对修改关闭(对使用 方)。用抽象构建框架，用实现扩展细节。
 * 3) 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已 有的代码来实现变化。
 * 4) 编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则。
 * @Date 2023/5/24
 */
public class Ocp {
    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Rectangle());

    }
}
