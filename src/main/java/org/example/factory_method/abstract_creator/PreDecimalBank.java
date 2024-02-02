package org.example.factory_method.abstract_creator;

import org.example.factory_method.products.Currency;
import org.example.factory_method.products.PreDecimalGbPound;

public class PreDecimalBank extends Bank {
    @Override
    public Currency getInstance() {
        return new PreDecimalGbPound(0, 0);
    }
}
