package org.example.factory_method.products;

public interface Currency {
    void add(int pennies);
    void subtract(int pennies);
    int getPounds();
    int getpennies();
}
