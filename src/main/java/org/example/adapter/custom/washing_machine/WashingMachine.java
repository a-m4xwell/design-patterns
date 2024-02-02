package org.example.adapter.custom.washing_machine;

public interface WashingMachine {

    void loadWashingMachine(int clothes);
    void addDetergent(int detergent);
    void startCycle(String cycle);
    void cycleComplete();
}
