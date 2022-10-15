package com.wang.prototype.improve.shallow;

public class QianSheep implements Cloneable{
    private String name;
    private int age;

    public QianSheep(String name, int age, String color, Sheep friend) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.friend = friend;
    }

    private String color;
    private Sheep friend;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        QianSheep sheep= (QianSheep) super.clone();
        return sheep;
    }

    @Override
    public String toString() {
        return "DeepSheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }
}
