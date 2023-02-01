package com.wang.singleton.type4;

public class SingletonTest4 {

    public static void main(String[] args) {
        System.out.println("懒汉式：线程安全");
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton == singleton1);
    }
}

class Singleton {
    private Singleton() {
    }

    private static Singleton singleton;
    public static synchronized Singleton getSingleton() {
        if (singleton==null){//线程安全,同时只能有一个对象执行这个方法
            singleton=new Singleton();
        }

        return singleton;
    }

}