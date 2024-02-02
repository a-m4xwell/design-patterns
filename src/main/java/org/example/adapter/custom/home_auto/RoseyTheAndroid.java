package org.example.adapter.custom.home_auto;

public class RoseyTheAndroid implements AutoWash{
    /*This is the default implementation of the autowash interface. it isn't required for this example but I have
    * included it to give some move context to how this pattern can be advantageous */
    private DefaultMachine defaultMachine = new DefaultMachine();
    @Override
    public void loadClothesAndPowderIntoMachine(int clothes, int powder) {
        System.out.printf("%s is doing the washing\n", this.getClass().getSimpleName());
        defaultMachine.addContents(clothes, powder);
    }

    @Override
    public void startTheMachine() {

    }

    @Override
    public void notifyOfCompleteCycle() {
        System.out.printf("%s cycle complete\n", this.getClass().getSimpleName());
    }

    private class DefaultMachine {
        public void addContents(int clothes, int powder){
            System.out.printf("%s Doing the washing with the default machine\n", this.getClass().getSimpleName());
            System.out.printf("%s washing %s clothes with %s powder\n", this.getClass().getSimpleName(), clothes, powder);
        }
        public void start(){
            System.out.printf("%s has started\n", this.getClass().getSimpleName());
        }

    }
}
