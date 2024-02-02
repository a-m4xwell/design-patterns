package org.example.builder.product.ga;


import lombok.Data;

@Data
public class GaFuselage {
    private String make;
    private String model;
    private GaWings wings;
    private GaLandingGear landingGear;
    private GaCrewCompartment crewCompartment;
    private GaEngine engine;

}
