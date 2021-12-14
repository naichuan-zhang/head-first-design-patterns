package com.naichuan.memento;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        Stack<StarMemento> states = new Stack<>();
        Star star = new Star(StarType.SUN, 10000000, 500000);
        log.info(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        log.info(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        log.info(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        log.info(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        log.info(star.toString());
        while (states.size() > 0) {
            star.setMemento(states.pop());
            log.info(star.toString());
        }
    }
}
