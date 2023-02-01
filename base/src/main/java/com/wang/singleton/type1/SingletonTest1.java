package com.wang.singleton.type1;

public class SingletonTest1 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton == singleton1);
    }
}

class Singleton {
    private Singleton() {
    }

    private final static Singleton singleton = new Singleton();


    public static Singleton getSingleton() {
        return singleton;
    }

}