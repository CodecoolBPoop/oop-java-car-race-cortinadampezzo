package com.codecool.car_race;

import java.util.Random;

public class Truck extends Vehicle {

    private static boolean isBrokenDown;

    // This method is not working properly.
    static void setBrokenDown() {
        Random random = new Random();
        int chanceOfBrokenDown = random.nextInt(100) + 1;
        if (chanceOfBrokenDown <= 5) {
            isBrokenDown = true;
        } else {
            isBrokenDown = false;
        }
    }

    static boolean isBrokenDown() {
        return isBrokenDown;
    }

    public Truck() {
        setName(generateName());
        setBrokenDown();
        this.type = "truck";
    }

    private static String generateName() {
        Random random = new Random();
        return "Truck " + random.nextInt(1000) + 1;
    }

    @Override
    public void prepareForLap(Race race) {
        if (!isBrokenDown()) {
            setSpeed(100);
        } else {
            setSpeed(0);
        }
    }

}
