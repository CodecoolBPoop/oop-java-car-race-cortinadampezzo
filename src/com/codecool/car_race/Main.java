package com.codecool.car_race;

public class Main {

    public static void main(String[] args) {
        Race race = new Race();
        race.createVehicles();
        race.simulateRace();
        race.printRaceResults();
    }

}
