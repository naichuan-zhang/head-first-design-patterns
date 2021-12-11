package com.naichuan.observer.weather;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
