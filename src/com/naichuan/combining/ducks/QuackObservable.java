package com.naichuan.combining.ducks;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
