package com.wang.singleton.type7;

public class SingletonTest7 {

    public static void main(String[] args) {
        System.out.println("静态内部类：线程安全，推荐");
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();//调用方法jvm才会加载静态内部类，类装载是安全的，延迟加载
        System.out.println(singleton==singleton1);
    }
}

class Singleton {
    private Singleton() {
    }
    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();//Singleton初始化时SingletonInstance不会加载
    }
    public static synchronized Singleton getSingleton() {
        return SingletonInstance.INSTANCE;
    }

}