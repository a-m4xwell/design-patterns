package org.example.factory_method.abstract_creator;

import org.example.factory_method.products.Currency;
import org.example.factory_method.products.GbPound;

public class PostDecimalBank extends Bank {
    @Override
    public Currency getInstance() {
        return new GbPound(0, 0);
    }
}
