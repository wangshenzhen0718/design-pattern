package com.wang.singleton.type3;

public class SingletonTest3 {

    public static void main(String[] args) {
        System.out.println("懒汉式：线程不安全");
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton == singleton1);
    }
}

class Singleton {
    private Singleton() {
    }

    private static Singleton singleton;
    public static Singleton getSingleton() {
        if (singleton==null){//线程不安全，多个线程到这里还没有向下执行
            singleton=new Singleton();
        }

        return singleton;
    }

}