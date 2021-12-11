package com.naichuan.singleton.subclass;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Singleton {
    protected static Singleton uniqueInstance;

    protected Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
