package com.naichuan.strategy.challenge;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Email implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("I'm emailing the photo");
    }
}
