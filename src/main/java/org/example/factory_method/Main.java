package org.example.factory_method;

import org.example.factory_method.abstract_creator.Bank;
import org.example.factory_method.abstract_creator.PostDecimalBank;
import org.example.factory_method.abstract_creator.PreDecimalBank;

public class Main {
    public static void main(String[] args) {
        /*
         * Factory Method
         * Intent: Define an interface for creating an object but let subclasses decide which class to instantiate
         * Lets a class defer instantiation to a subclass
         *
         * Goal
         * Provide two examples of a factory method using an abstract and a default implementation
         * The factories should produce currency, the pre-decimal £ and the modern £
         * Each currently should contain its pennies and have methods to add and subtract values
         *
         * */


        /*
        Examples of the Factory Method in the Java Core Library
        Calendar instance = Calendar.getInstance();
        NumberFormat instance1 = NumberFormat.getInstance();*/


        int pennies = (int) (Math.random() * 1000);
        System.out.println("Depositing " + pennies + "p in the bank");

        if (Math.random() * 10 > 5) {
            System.out.println("The year is post 1971");
            Bank bank = new PostDecimalBank();
            bank.depositMoney(pennies);
        } else {
            System.out.println("The year is pre 1971");
            Bank bank = new PreDecimalBank();
            bank.depositMoney(pennies);
        }
    }
}
