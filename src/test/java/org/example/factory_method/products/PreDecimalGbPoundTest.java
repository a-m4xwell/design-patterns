package org.example.factory_method.products;


import org.junit.jupiter.api.Test;

class PreDecimalGbPoundTest {

    @Test
    public void test(){
        PreDecimalGbPound currency = new PreDecimalGbPound(0,0);

        currency.add(200);
        currency.add(200);

        System.out.println("Currency contains £" + currency.getPounds() + " : " + currency.getpennies() + "p");

        assert currency.getPounds() == 1;
        assert currency.getpennies() == 160;


        currency.subtract(160);
        currency.subtract(160);

        System.out.println("Currency contains £" + currency.getPounds() + " : " + currency.getpennies() + "p");

        assert currency.getPounds() == 0;
        assert currency.getpennies() == 80;
    }

}