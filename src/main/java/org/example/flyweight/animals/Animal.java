package org.example.flyweight.animals;

public interface Animal {

    String getScientificName();
    String getCommonName();
    String getNoise();
    void printRecord(String location);
}
