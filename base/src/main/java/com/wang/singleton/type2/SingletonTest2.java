package com.wang.singleton.type2;

public class SingletonTest2 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton == singleton1);
    }
}

class Singleton {
    private Singleton() {
    }

    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }


    public static Singleton getSingleton() {
        return singleton;
    }

}