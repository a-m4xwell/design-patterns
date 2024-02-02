package org.example.facade.subsystem;

public class SubsystemFacade {


    public int add(int a, int b) {
        return Addition.add(a, b);
    }

    public int subtract(int total, int subtraction) {
        return Subtraction.subtract(total, subtraction);
    }

    public int multiply(int value, int multiplication) {
        return Multiplier.multiply(value, multiplication);
    }

    public int divide(int value, int division) {
        return Divider.divide(value, division);
    }

    public double root(int a) {
        return Rooter.root(a);
    }

    public double square(int a) {
        return Rooter.square(a);
    }
}
