package org.example.abstract_factory;

import org.example.abstract_factory.factory.BusinessVehicleFactory;
import org.example.abstract_factory.factory.CivilianVehicleFactory;
import org.example.abstract_factory.factory.VehicleFactory;
import org.example.abstract_factory.product.Vehicle;

public class Client {
    public static void main(String[] args) {
        /*
        * The Abstract Factory pattern provides an interface for creating families or related or dependant objects
        * without specifying a concrete class
        *
        * GOAL:
        * Create a factory interface and concrete classes to create a set of objects related to a road vehicle
        * One factory will create civilian vehicles
        * The Other will create Business Vehicles
        *
        * Factory Interface
        * getCheapVehicle();
        * getPassengerCarryingVehicle();
        * getCargoCarryingVehicle();
        *
        * Vehicle Interface
        * getVehicleType();
        * getVehicleName();
        *
        * */

        VehicleFactory factory;

        //Randomly choose a factory to use
        if(Math.random() * 10 > 5){
            factory = new CivilianVehicleFactory();
        }else {
            factory = new BusinessVehicleFactory();
        }

        Vehicle cheapVehicle = factory.getCheapVehicle();
        Vehicle passengerCarryingVehicle = factory.getPassengerCarryingVehicle();
        Vehicle cargoCarryingVehicle = factory.getCargoCarryingVehicle();

        System.out.println("The vehicle type returned was " + cheapVehicle.getVehicleType());
        System.out.println("-- Fleet Info --");
        System.out.println("Category | Name");
        System.out.println("Cheap | " + cheapVehicle.getVehicleName());
        System.out.println("Passenger | " + passengerCarryingVehicle.getVehicleName());
        System.out.println("Cargo | " + cargoCarryingVehicle.getVehicleName());

    }
}
