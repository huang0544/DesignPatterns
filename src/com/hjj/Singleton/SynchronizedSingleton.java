package com.hjj.Singleton;

/**
 * 线程安全懒汉式
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {

    }

    //对外提供获取实例的方法，对方法加锁
    public synchronized static SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

}
