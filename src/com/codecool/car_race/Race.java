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
            Truck.setBrokenDown();
            for (Vehicle vehicle : vehicles) {
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour(this);
            }
        }
    }

    void printRaceResults() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName() + ": " + vehicle.getDistanceTravelled() + "km; " + vehicle.type);
        }
    }

    static boolean isThereABrokenTruck() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck && Truck.isBrokenDown()) {
                return true;
            }
        }
        return false;
    }

}
