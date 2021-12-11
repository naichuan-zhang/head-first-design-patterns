package com.naichuan.adapter.ducks.challenge;

import com.naichuan.adapter.ducks.Duck;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class DroneAdapter implements Duck {
    Drone drone;

    public DroneAdapter(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void quack() {
        drone.beep();
    }

    @Override
    public void fly() {
        drone.spin_rotors();
        drone.take_off();
    }
}
