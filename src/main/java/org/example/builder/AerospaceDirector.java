package org.example.builder;

import org.example.builder.builder.Builder;

public class AerospaceDirector {
    private final Builder builder;

    public AerospaceDirector(Builder builder) {
        this.builder = builder;
    }

    public void constructVehicle(){
        builder.buildFuselage();
        builder.buildLandingGear();
        builder.buildWings();
        builder.buildCrewCompartment();
        builder.buildEngines();
    }
}
