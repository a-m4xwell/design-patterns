package org.example.adapter.custom.custom_adapter;

import org.example.adapter.custom.home_auto.AutoWash;
import org.example.adapter.custom.washing_machine.HotpointWashingMachine;

public class WashingMachineClassAdapter extends HotpointWashingMachine implements AutoWash {
    /*This is a 2 way adapter
    * The 2 way communication is achieved but using subclassing, this is a subclass of out Hotpoint washing machine
    * This has the drawback that if we want to adapt another make of washing machine we need to write a whole new clas
    * */
    @Override
    public void loadClothesAndPowderIntoMachine(int clothes, int powder) {
      super.loadWashingMachine(clothes);
      super.addDetergent(powder);
    }

    @Override
    public void startTheMachine() {
        super.startCycle("cotton");
    }

    @Override
    public void cycleComplete(){
        /*we are overriding this method from the Hotpoint machine to allow our 2 way communication*/
        super.cycleComplete(); //call the original method???
        System.out.println("Hotpoint machine has completed it's cycle");
        notifyOfCompleteCycle();
    }

    @Override
    public void notifyOfCompleteCycle() {
        System.out.println("AutoWash has been notified that the cycle is complete!");
    }
}
