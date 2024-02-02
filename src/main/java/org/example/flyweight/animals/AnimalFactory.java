package org.example.flyweight.animals;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {

    private Map<String, Animal> sharedAnimals;
    public AnimalFactory(){
        sharedAnimals = new HashMap<>();
    }

    public Animal getAnimal(String key){
        Animal animal = sharedAnimals.get(key);
        if(animal == null){
            buildNewAnimal(key);
            return sharedAnimals.get(key);
        }else {
            return animal;
        }
    }

    public int getObjectCount(){
        return sharedAnimals.keySet().size();
    }

    private void buildNewAnimal(String key) {
        Animal animal = switch (key) {
            case "elephant" -> new Elephant();
            case "polarbear" -> new PolarBear();
            default -> new Kangaroo();
        };
        sharedAnimals.put(key, animal);

    }
}
