package com.codecool.car_race;

import java.util.ArrayList;
import java.util.List;


public class Race {

    private static List<Vehicle> vehicles = new ArrayList<>();

    void createVehicles() {
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Car());
            vehicles.add(new Motorcycle());
            vehicles.add(new Truck());
        }
    }

    void simulateRace() {
        for (int i = 0; i < 50; i++) {
            Weather.setRaining();
            for (Vehicle vehicle : vehicles) {
                vehicle.moveForAnHour(this);
                vehicle.prepareForLap(this);
//                System.out.println(vehicle.getDistanceTravelled());
//                System.out.println(vehicle.getName());
            }
        }
    }

    // Prints each vehicle's name, distance traveled and type.
    void printRaceResults() {

    }

    // Returns true if there is a broken truck on track.
    boolean isThereABrokenTruck() {
        return false;
    }

}
