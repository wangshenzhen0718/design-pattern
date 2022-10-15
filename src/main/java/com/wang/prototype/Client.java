package com.wang.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("多莉", 1, "白色");
        Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        System.out.println(sheep+""+sheep.hashCode());
        System.out.println(sheep1+""+sheep1.hashCode());
        System.out.println(sheep==sheep1);
    }
}
