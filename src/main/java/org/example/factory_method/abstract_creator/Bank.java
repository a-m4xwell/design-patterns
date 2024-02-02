package org.example.factory_method.abstract_creator;

import org.example.factory_method.products.Currency;

public abstract class Bank {

    public void depositMoney(int pennies){
        Currency currency = getInstance();
        currency.add(pennies);
        String name = currency.getClass().getName();
        System.out.println("The currency is " + name + " and it has £" + currency.getPounds() + " " + currency.getpennies() + "p");
    }

    public abstract Currency getInstance();
}
