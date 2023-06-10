package com.wang.p5_instance.design;
/**
 * @Author:wsz
 * @Date: 2023/6/8 21:52
 * @Description:双重检查锁
 * @Version: 1.0
 * @Since: 1.0
 */
public class SingletonDcl {
    private SingletonDcl(){}

    private static volatile SingletonDcl instance;

    public static SingletonDcl getInstance() {
        if (instance == null){
            synchronized (SingletonDcl.class){
                if (instance == null){
                    instance = new SingletonDcl();
                }
            }

        }
        return instance;
    }
}
