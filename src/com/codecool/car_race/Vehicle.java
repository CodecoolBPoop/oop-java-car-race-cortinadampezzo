package com.codecool.car_race;

public abstract class Vehicle {

    private int distanceTravelled;
    private int speed;
    private String name;

    // The vehicle travels for an hour. It increases the distance traveled.
    // Call this from the Race::simulateRace() only!
    abstract void moveForAnHour(Race race);

    // Setup the actual speed used for the current lap.
    abstract void prepareForLap(Race race);

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled += distanceTravelled;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
