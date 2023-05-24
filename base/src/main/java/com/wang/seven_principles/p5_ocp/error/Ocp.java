package com.wang.seven_principles.p5_ocp.error;

/**
 * @Author wsz
 * @Description 优缺点
 * 1) 优点是比较好理解，简单易操作。
 * 2) 缺点是违反了设计模式的ocp原则，即对扩展开放(提供方)，对修改关闭(使用方)。 即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码.
 * 3) 比如我们这时要新增加一个图形种类 三角形修改的地方 较多
 * 方式1的改进的思路分析
 * 思路：把创建Shape类做成抽象类，并提供一个抽象的draw方法，让子类去实现即可， 这样我们有新的图形种类时，只需要让新的图形类继承Shape，并实现draw方法即可， 使用方的代码就不需要修 -> 满足了开闭原则
 * @Date 2023/5/24
 */
public class Ocp {
    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());

    }
}
