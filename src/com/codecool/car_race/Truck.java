package com.codecool.car_race;

// Speed: 100km/h. 5% chance of breaking down for 2 turns.
// Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
public class Truck extends Vehicle {

    // Holds how long its still broken down.
    private Integer breakDownTurnsLeft;

    public Truck() {
        this.type = "truck";
    }

    @Override
    void moveForAnHour(Race race) {

    }

    @Override
    void prepareForLap(Race race) {

    }
}
