package com.codecool.car_race;

import java.util.Random;


public class Weather {

    private static boolean isRaining;

    static void setRaining() {

        Random random = new Random();
        int chanceOfRaining = random.nextInt(100) + 1;
        isRaining = chanceOfRaining <= 30;

    }

    static boolean isRaining() {
        return isRaining;
    }

}
