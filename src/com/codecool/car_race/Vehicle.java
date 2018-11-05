package com.codecool.car_race;

public abstract class Vehicle {

    private int distanceTravelled;
    private int speed;
    private String name;
    String type;

    public void moveForAnHour(Race race) {
        setDistanceTravelled(getSpeed());
    }

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
