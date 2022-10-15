package com.wang.singleton.type8;

public class SingletonTest8 {

    public static void main(String[] args) {
        System.out.println("枚举：线程安全，推荐");
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance==instance2);
        instance.sayHello();
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println(runtime==runtime1);
    }
}
enum  Singleton {
    INSTANCE;
    public void sayHello(){
        System.out.println("ok!!!");
    }


}