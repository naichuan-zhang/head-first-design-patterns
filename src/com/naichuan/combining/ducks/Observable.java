package com.naichuan.combining.ducks;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Observable implements QuackObservable {
    ArrayList<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable observable) {
        this.duck = observable;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }
}
