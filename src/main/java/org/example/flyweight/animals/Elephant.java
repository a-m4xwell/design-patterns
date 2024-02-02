package org.example.flyweight.animals;

public class Elephant implements Animal{

    //Intrinsic State
    private final String scientificName = "L. africana";
    private final String commonName = "African Elephant";
    private final String noise = "rrrrrrrrrrrrrrrrrr";

    protected Elephant(){}

    @Override
    public String getScientificName() {
        return scientificName;
    }

    @Override
    public String getCommonName() {
        return commonName;
    }

    @Override
    public String getNoise() {
        return noise;
    }

    @Override
    public void printRecord(String location) {
        System.out.printf("I am an %s, aka %s, I go %s and I live in the %s pen\n", commonName, scientificName, noise, location);
    }
}
