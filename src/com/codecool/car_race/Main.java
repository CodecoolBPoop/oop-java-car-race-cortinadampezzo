package com.codecool.car_race;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Vehicle> vehicles = new ArrayList<>();

    private static void createVehicles() {
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Car());
            vehicles.add(new Motorcycle());
            vehicles.add(new Truck());
        }
    }


    public static void main(String[] args) {
        Race race = new Race();
        createVehicles();

        race.simulateRace();
        race.printRaceResults();
    }

}
