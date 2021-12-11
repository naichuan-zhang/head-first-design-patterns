package com.naichuan.singleton.subclass;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class CoolerSingleton extends Singleton {
    protected static Singleton uniqueInstance;

    private CoolerSingleton() {
        super();
    }
}
