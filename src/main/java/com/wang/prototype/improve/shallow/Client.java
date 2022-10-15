package com.wang.prototype.improve.shallow;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("多莉", 1, "白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        //----------------------------------------
        System.out.println("浅拷贝");
        QianSheep qianSheep = new QianSheep("多莉", 1, "白色",new Sheep("多莉", 1, "白色"));
        QianSheep clone = (QianSheep) qianSheep.clone();
        System.out.println(qianSheep);
        System.out.println(qianSheep.getFriend().hashCode());
        System.out.println(clone.getFriend().hashCode());
        //------------


    }
}
