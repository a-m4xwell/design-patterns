package org.example.abstract_factory.product.business;

import org.example.abstract_factory.product.Vehicle;

public class BusinessPassengerVehicle implements Vehicle {
    @Override
    public String getVehicleType() {
        return "Business";
    }

    @Override
    public String getVehicleName() {
        return "Optare Tempo";
    }
}
