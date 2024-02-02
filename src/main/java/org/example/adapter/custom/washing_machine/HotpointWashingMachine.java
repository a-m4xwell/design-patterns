package org.example.adapter.custom.washing_machine;

public class HotpointWashingMachine implements WashingMachine{

    private int clothes = 0;
    private int detergent = 0;
    @Override
    public void loadWashingMachine(int clothes) {
        this.clothes = clothes;
    }

    @Override
    public void addDetergent(int detergent) {
        this.detergent = detergent;
    }

    @Override
    public void startCycle(String cycle) {
        switch (cycle) {
            case "woolen":
                System.out.printf("%s Starting woolen wash: 30deg\n", this.getClass().getSimpleName());
                printMachineContents();
                cycleComplete();
                break;
            case "cotton":
                System.out.printf("%s Starting a cotton wash: 60deg\n", this.getClass().getSimpleName());
                printMachineContents();
                cycleComplete();
                break;
            default:
                System.out.printf("%s Starting a standard wash: 40deg\n", this.getClass().getSimpleName());
                printMachineContents();
                cycleComplete();
        }
    }

    @Override
    public void cycleComplete() {
        detergent = 0;
        System.out.printf("%s Cycle has completed\n", this.getClass().getSimpleName());
    }

    private void printMachineContents(){
        System.out.printf("%s Machine contains %s clothes and %s detergent\n", this.getClass().getSimpleName(), clothes, detergent);
    }
}
