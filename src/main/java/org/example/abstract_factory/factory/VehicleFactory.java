package org.example.abstract_factory.factory;

import org.example.abstract_factory.product.Vehicle;

public interface VehicleFactory {
    Vehicle getCheapVehicle();
    Vehicle getPassengerCarryingVehicle();
    Vehicle getCargoCarryingVehicle();
}
