package org.example.factory_method.products;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GbPound implements Currency {
    private int pounds;
    private int pennies;

    @Override
    public void add(int pennies) {
        this.pennies += pennies;
        if (this.pennies >= 100) {
            //Distribute additional pennies into the pounds
            int remainder = this.pennies % 100;
            this.pounds += (this.pennies - remainder) / 100;
            this.pennies = remainder;
        }
    }

    @Override
    public void subtract(int pennies) {
        this.pennies -= pennies;
        if (this.pennies < 0) {
            this.pounds--;
            int abs = Math.abs(this.pennies);
            int remainder = abs % 100;
            this.pounds -= (abs - remainder) / 100;
            this.pennies = remainder;
        }
    }

    @Override
    public int getPounds() {
        return this.pounds;
    }

    @Override
    public int getpennies() {
        return this.pennies;
    }
}
