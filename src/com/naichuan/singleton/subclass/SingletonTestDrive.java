package com.naichuan.singleton.subclass;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class SingletonTestDrive {
    public static void main(String[] args) {
        Singleton singleton = CoolerSingleton.getInstance();
        System.out.println(singleton);
    }
}
