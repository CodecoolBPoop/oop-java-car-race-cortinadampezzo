package com.codecool.car_race;

import java.util.Random;

public class Car extends Vehicle {

    private static String[] carNames = {
            "Albatross", "Blast", "Capital", "Centurion", "Cobra", "Crux", "Curiosity", "Daydream", "Dusk",
            "Dynamics", "Empire", "Eon", "Essence", "Flow", "Fragment", "Ivory", "Liberty", "Momentum", "Motive",
            "Paladin", "Parallel", "Passion", "Roamer", "Silver", "Thunder", "Tigress", "Trailblazer", "Viper",
            "Voyage", "Zeal"
    };

    public Car() {
        setName(generateName());
        this.type = "car";
    }

    private static String generateName() {
        Random random = new Random();
        return carNames[random.nextInt(30)] + " " + carNames[random.nextInt(30)];
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

}
