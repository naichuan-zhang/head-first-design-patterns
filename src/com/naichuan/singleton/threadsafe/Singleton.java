package com.naichuan.singleton.threadsafe;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a thread safe Singleton";
    }
}
