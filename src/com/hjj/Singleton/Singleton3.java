package com.hjj.Singleton;

/**
 * 懒汉式
 */
public class Singleton3 {
    //定义实例
    private static Singleton3 instance;

    //私有化构造方法
    private Singleton3() {

    }

    //对外提供获取实例的静态方法
    public static Singleton3 getInstance() {
        //对象使用的时候才实例化
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
