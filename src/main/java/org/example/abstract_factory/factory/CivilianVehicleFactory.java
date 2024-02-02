package org.example.abstract_factory.factory;

import org.example.abstract_factory.product.civilian.CivilianCargoVehicle;
import org.example.abstract_factory.product.civilian.CivilianCheapVehicle;
import org.example.abstract_factory.product.Vehicle;
import org.example.abstract_factory.product.civilian.CivilianPassengerVehicle;

public class CivilianVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getCheapVehicle() {
        return new CivilianCheapVehicle();
    }

    @Override
    public Vehicle getPassengerCarryingVehicle() {
        return new CivilianPassengerVehicle();
    }

    @Override
    public Vehicle getCargoCarryingVehicle() {
        return new CivilianCargoVehicle();
    }
}
