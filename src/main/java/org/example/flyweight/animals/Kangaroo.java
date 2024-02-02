package org.example.flyweight.animals;

public class Kangaroo implements Animal{
    //Intrinsic State
    private final String scientificName = "Macropus giganteus";
    private final String commonName = "Eastern Grey Kangaroo";
    private final String noise = "Huh huh huh";

    protected Kangaroo(){}

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
