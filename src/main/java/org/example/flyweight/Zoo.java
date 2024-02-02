package org.example.flyweight;

import org.example.flyweight.animals.Animal;
import org.example.flyweight.animals.AnimalFactory;

import java.util.*;

public class Zoo {

    private Map<String, List<Animal>> pens;
    private AnimalFactory animalFactory;

    public Zoo() {
        //Setup the pens, the pens are named after the continents but can contain any kind of animal
        pens = new HashMap<>();
        pens.put("North_America", new ArrayList<>());
        pens.put("South_America", new ArrayList<>());
        pens.put("Oceania", new ArrayList<>());
        pens.put("Africa", new ArrayList<>());
        pens.put("Europe", new ArrayList<>());
        pens.put("Antarctica", new ArrayList<>());
        pens.put("Asia", new ArrayList<>());

        animalFactory = new AnimalFactory();
    }

    public void printStatusZoo() {
        Set<String> keys = pens.keySet();
        keys.forEach(key -> {
            List<Animal> animals = pens.get(key);
            animals.forEach(animal -> animal.printRecord(key));
        });
        System.out.println("The Animal Factory only has " + animalFactory.getObjectCount() + " animal Objects");
    }

    public void addAnimal(String animal) {
        Animal newAnimal = animalFactory.getAnimal(animal);

        //Randomly assign the new animal to a pen
        long random = Math.round(Math.random() * 6);
        Object[] keys = pens.keySet().stream().toArray();
        Object key = keys[(int) random];
        pens.get(key).add(newAnimal);
    }
}
