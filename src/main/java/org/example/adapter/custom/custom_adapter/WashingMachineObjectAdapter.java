package org.example.adapter.custom.custom_adapter;

import org.example.adapter.custom.home_auto.AutoWash;
import org.example.adapter.custom.washing_machine.WashingMachine;

public class WashingMachineObjectAdapter implements AutoWash {
    /*This is a simple one way adapter
    * It uses composition to achieve the adaptation
    * */
    private WashingMachine washingMachine;

    public WashingMachineObjectAdapter(WashingMachine washingMachine){
        this.washingMachine = washingMachine;
    }
    @Override
    public void loadClothesAndPowderIntoMachine(int clothes, int powder) {
        washingMachine.loadWashingMachine(clothes);
        washingMachine.addDetergent(powder);
    }

    @Override
    public void startTheMachine() {
        washingMachine.startCycle(""); //Should use the standard cycle
    }

    @Override
    public void notifyOfCompleteCycle() {
        /*As this is only a one way adapter this method will not be used, there is no way for the machine to notify the
        * adapter that it has completed it's cycle*/

    }
}
