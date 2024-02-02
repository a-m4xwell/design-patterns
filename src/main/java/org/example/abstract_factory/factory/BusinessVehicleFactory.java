package org.example.abstract_factory.factory;

import org.example.abstract_factory.product.business.BusinessCargoVehicle;
import org.example.abstract_factory.product.business.BusinessCheapVehicle;
import org.example.abstract_factory.product.Vehicle;
import org.example.abstract_factory.product.business.BusinessPassengerVehicle;

public class BusinessVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getCheapVehicle() {
        return new BusinessCheapVehicle();
    }

    @Override
    public Vehicle getPassengerCarryingVehicle() {
        return new BusinessPassengerVehicle();
    }

    @Override
    public Vehicle getCargoCarryingVehicle() {
        return new BusinessCargoVehicle();
    }
}
