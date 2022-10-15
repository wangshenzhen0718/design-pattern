package com.wang.singleton.type06;

public class SingletonTest6 {

    public static void main(String[] args) {
        System.out.println("双重检查：线程安全");
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton == singleton1);
    }
}

class Singleton {
    private Singleton() {
    }

    private static volatile Singleton singleton;//保证可见性

    public static Singleton getSingleton() {
        if (singleton == null) {//可能同时有多个线程进来
            synchronized (Singleton.class) {//但是这里只能有一个 其他线程等着
                if (singleton == null) {//一个线程执行
                    singleton = new Singleton();//执行完singleton就不是null了同时进来的别的线程就不会再new了
                }
            }
        }
        return singleton;
    }

}