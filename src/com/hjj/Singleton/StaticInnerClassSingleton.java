package com.hjj.Singleton;

/**
 * 静态内部类式
 */
public class StaticInnerClassSingleton {
    //在静态内部类中初始化实例对象
    private static class Singleton {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    //私有的构造方法
    private StaticInnerClassSingleton() {

    }

    //对外提供获取实例的静态方法
    public static final StaticInnerClassSingleton getInstance(){
        return Singleton.INSTANCE;
    }
}
