package com.codecool.car_race;

import java.util.Random;

public class Car extends Vehicle {

    private String[] carNames = {
            "Albatross", "Blast", "Capital", "Centurion", "Cobra", "Crux", "Curiosity", "Daydream", "Dusk",
            "Dynamics", "Empire", "Eon", "Essence", "Flow", "Fragment", "Ivory", "Liberty", "Momentum", "Motive",
            "Paladin", "Parallel", "Passion", "Roamer", "Silver", "Thunder", "Tigress", "Trailblazer", "Viper",
            "Voyage", "Zeal"
    };

    public Car() {
        generateName();
        this.type = "car";
    }

    private void generateName() {
        Random random = new Random();
        setName(carNames[random.nextInt(30)] + " " + carNames[random.nextInt(30)]);
    }

    @Override
    public void prepareForLap(Race race) {
        if (Race.isThereABrokenTruck()) {
            setSpeed(75);
        } else {
            Random random = new Random();
            setSpeed(random.nextInt(30) + 80);
        }
    }

    @Override
    public void moveForAnHour(Race race) {
        setDistanceTravelled(getSpeed());
    }

}
