package org.example.abstract_factory.product.civilian;

import org.example.abstract_factory.product.Vehicle;

public class CivilianCargoVehicle implements Vehicle {
    @Override
    public String getVehicleType() {
        return "Civilian";
    }

    @Override
    public String getVehicleName() {
        return "Ford Ranger";
    }
}
