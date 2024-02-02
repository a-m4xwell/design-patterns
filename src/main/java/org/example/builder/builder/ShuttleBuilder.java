package org.example.builder.builder;

import lombok.Getter;
import org.example.builder.product.shuttle.*;

@Getter
public class ShuttleBuilder implements Builder{

    private ShuttleFuselage fuselage;

    @Override
    public void buildFuselage() {
        fuselage = new ShuttleFuselage();
        fuselage.setName("Discovery");
    }

    @Override
    public void buildWings() {
        if(fuselage == null){
            return;
        }
        fuselage.setWings(new ShuttleWings());
    }

    @Override
    public void buildEngines() {
        if(fuselage == null){
            return;
        }
        fuselage.setEngine(new ShuttleEngine());
    }

    @Override
    public void buildCrewCompartment() {
        if(fuselage == null){
            return;
        }
        fuselage.setCrewCompartment(new ShuttleCrewCompartment());
    }

    @Override
    public void buildLandingGear() {
        if(fuselage == null){
            return;
        }
        fuselage.setLandingGear(new ShuttleLandingGear());
    }
}
