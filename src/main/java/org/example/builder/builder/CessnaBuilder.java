package org.example.builder.builder;

import lombok.Getter;
import org.example.builder.product.ga.*;

@Getter
public class CessnaBuilder implements Builder{

    private GaFuselage fuselage;

    @Override
    public void buildFuselage() {
        fuselage = new GaFuselage();
        fuselage.setMake("Cessna");
        fuselage.setModel("172");
    }

    @Override
    public void buildWings() {
        if(fuselage == null){
            return;
        }
        GaWings wings = new GaWings();
        wings.setShape("High Wing");
        wings.setSpanMeters(11);
        fuselage.setWings(wings);
    }

    @Override
    public void buildEngines() {
        if(fuselage == null){
            return;
        }
        GaEngine engine = new GaEngine();
        engine.setMake("Lycoming");
        engine.setModel("O-360");
        engine.setFuel("Avgas");
        engine.setType("Four-cylinder, four-stroke, Rotary engine");
        fuselage.setEngine(engine);
    }

    @Override
    public void buildCrewCompartment() {
        if(fuselage == null){
            return;
        }
        GaCrewCompartment crew = new GaCrewCompartment();
        crew.setSeats(2);
        crew.setAvionics("Garmin G1000");
        fuselage.setCrewCompartment(crew);
    }

    @Override
    public void buildLandingGear() {
        if(fuselage == null){
            return;
        }
        GaLandingGear landingGear = new GaLandingGear();
        landingGear.setType("Fixed");
        landingGear.setWheelCount(3);
        fuselage.setLandingGear(landingGear);
    }
}
