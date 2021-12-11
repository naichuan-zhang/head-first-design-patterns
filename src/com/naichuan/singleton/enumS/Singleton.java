package com.naichuan.singleton.enumS;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public enum Singleton {
    UNIQUE_INSTANCE;

    public String getDescription() {
        return "I'm a thread safe Singleton";
    }
}
