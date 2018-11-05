package com.codecool.car_race;

import java.util.Random;

public class Motorcycle extends Vehicle {

    private static int motorCycleNumber = 1;

    public Motorcycle() {
        generateName();
        this.type = "motorcycle";
    }

    private void generateName() {
        setName("Motorcycle " + motorCycleNumber++);
    }


    @Override
    public void prepareForLap(Race race) {
        if (!Weather.isRaining()) {
            setSpeed(100);
        } else {
            Random random = new Random();
            setSpeed(random.nextInt(45) + 50);
        }
    }

}
