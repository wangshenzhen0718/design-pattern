package com.wang.principle.inversion.improve;

public class DepencyInversion1 {
    public static void main(String[] args) {
        Persion1 persion = new Persion1();
        persion.receive1(new Email1());
        persion.receive1(new WeChat());

    }
}
interface IReceive{
    void getInfo();

}
class Email1 implements IReceive{


    public void getInfo() {
        System.out.println("email");
    }
}
class WeChat implements IReceive{

    public void getInfo() {
        System.out.println("wechat");
    }
}
class Persion1{
    public void receive1(IReceive iReceive){
        iReceive.getInfo();

    }



}
