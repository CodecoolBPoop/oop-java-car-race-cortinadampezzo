package com.codecool.car_race;

import java.util.Random;


public class Weather {

    private static boolean isRaining;

    static void setRaining() {

        Random random = new Random();
        Integer chanceOfRaining = random.nextInt(100) + 1;

        if (chanceOfRaining <= 30) {
            isRaining = true;
        } else {
            isRaining = false;
        }

    }

    boolean isRaining() {
        return isRaining;
    }

}
