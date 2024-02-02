package org.example.adapter.custom;

import org.example.adapter.custom.custom_adapter.WashingMachineClassAdapter;
import org.example.adapter.custom.custom_adapter.WashingMachineObjectAdapter;
import org.example.adapter.custom.home_auto.AutoWash;
import org.example.adapter.custom.home_auto.RoseyTheAndroid;
import org.example.adapter.custom.home_auto.SmartHub;
import org.example.adapter.custom.washing_machine.HotpointWashingMachine;

public class Main {
    public static void main(String[] args) {
        /*Implement the adapter pattern
        * The adapter pattern allows us to adapt one class to another where there is no compatible interface
        * In this instance I will build an adapter for a home automation system that will allow it to talk to a washing machine
        * It should be able to both load the washing machine, add a detergent and switch it on
        * I will create 2 versions of the adapter
        * The first will be a simple 1 way adapter and the second will be a 2 way adapter that will allow the machine to
        * notify the smart system that it has completed a cycle
        *
        * In this scenario the code for the machine and the code for the home automation system has been written by 2
        * different companies, represented by the 2 packages; washing_machine and home_auto, and I am writing an adapter,
        * I effectively have no control over the machine and automation code, all my code will be in a third package,
        * custom_adapter
        *
        * I have accentuated the difference between the 2 packages by using different method names where I can*/

        //This first block represents the default implementation of the autowash interface
        System.out.println("Doing a default wash");
        AutoWash autoWash = new RoseyTheAndroid();
        SmartHub smartHub = new SmartHub(autoWash);
        smartHub.receiveCommand("washing");
        System.out.println("\n\n");
        /*Output should be
        * Starting a washing
        * RoseyTheAndroid is doing the washing
        * DefaultMachine Doing the washing with the default machine
        * DefaultMachine washing 15 clothes with 20 powder*/

        //This is our adapter class, the parameter could be changed for another concrete class of WashingMachine
        System.out.println("Doing a wash with an object adapter");
        AutoWash adaptedObjectAutoWash = new WashingMachineObjectAdapter(new HotpointWashingMachine());
        SmartHub adaptedObjectSmartHub = new SmartHub(adaptedObjectAutoWash); //Our smart hub with our adapter as the autoWash parameter
        adaptedObjectSmartHub.receiveCommand("washing"); //The command to use the automation software to do a washing
        System.out.println("\n\n");
        /*The output should be the following
        * Starting a washing
        * HotpointWashingMachine Starting a standard wash: 40deg
        * HotpointWashingMachine Machine contains 15 clothes and 20 detergent
        * HotpointWashingMachine Cycle has completed
        * */

        /*Using a Class Adapter*/
        System.out.println("Doing a wash with a class adapter");
        AutoWash adaptedClassAutoWash = new WashingMachineClassAdapter();
        SmartHub adaptedClassSmartHub = new SmartHub(adaptedClassAutoWash);
        adaptedClassSmartHub.receiveCommand("washing");
    }
}
