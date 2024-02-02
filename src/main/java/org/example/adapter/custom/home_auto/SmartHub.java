package org.example.adapter.custom.home_auto;

public class SmartHub {
    /*This is the Smart Hub, for the purpose of this example, this is the client that will ask for a washing to be put
    * on. It comes from the home_auto framework and can be configured before being ran. This is not required but again
    * it gives some more context for a good situation to use an adapter*/

    private AutoWash autoWash;

    public SmartHub(AutoWash autoWash){
        this.autoWash = autoWash;
    }

    public void receiveCommand(String command){
        switch (command){
            case "washing":
                System.out.println("Starting a washing");
                autoWash.loadClothesAndPowderIntoMachine(15, 20);
                autoWash.startTheMachine();
                break;
            default:
                System.out.println("Command not recognised");
        }
    }
}
