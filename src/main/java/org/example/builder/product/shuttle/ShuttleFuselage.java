package org.example.builder.product.shuttle;

import lombok.Data;

@Data
public class ShuttleFuselage {
    private String name;
    private ShuttleEngine engine;
    private ShuttleWings wings;
    private ShuttleCrewCompartment crewCompartment;
    private ShuttleLandingGear landingGear;
}
