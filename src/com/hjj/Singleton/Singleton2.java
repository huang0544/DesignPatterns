package com.hjj.Singleton;

/**
 * 单例模式--饿汉式变种
 */
public class Singleton2 {
    //在类内部定义
    private static Singleton2 instance;

    static{
        //实例化该实例
        instance = new Singleton2();
    }

    //私有的构造函数，外部无法访问
    private Singleton2(){

    }

    //对外提供获取实例的静态方法
    public static Singleton2 getInstance(){
        return instance;
    }
}
