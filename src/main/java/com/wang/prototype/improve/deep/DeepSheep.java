package com.wang.prototype.improve.deep;

import java.io.*;

public class DeepSheep implements Cloneable,Serializable{
    private String name;
    private int age;

    public DeepSheep(String name, int age, String color, Sheep friend) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.friend = friend;
    }

    private String color;
    private Sheep friend;


/*    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepSheep sheep= (DeepSheep) super.clone();
        sheep.setFriend((Sheep) sheep.getFriend().clone());
        return sheep;
    }*/
    public Object ConcretePrototype() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bio = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bio);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bio.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        DeepSheep o = (DeepSheep) ois.readObject();
        return o;
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
