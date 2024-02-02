package org.example.adapter.custom.home_auto;

public interface AutoWash {
    /*This is the target interface
    * This interface is recognised by our home automation software but the interface for our washing machine is not
    * so we need to write an adapter that will take these operations and call the corresponding operations on the
    * washing machine */

    void loadClothesAndPowderIntoMachine(int clothes, int powder);
    void startTheMachine();

    void notifyOfCompleteCycle();
}
