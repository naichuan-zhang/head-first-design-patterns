package com.naichuan.observer.weather;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
