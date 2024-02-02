package org.example.flyweight;

import java.util.Arrays;

public class Main {
    private static String[] animalTypes = {"elephant", "polarbear", "kangaroo"};

    public static void main(String[] args) {
        /* The Flyweight pattern allows us to use sharing to support a large number of fine-grained objects effectively
        * What this means is if we have an application that has the potential to have a lot of objects, which would then
        * have a significant cost in storage space. Then we can reduce those objects to a handful of shared objects.
        * However, we must be able to clearly divide the various states of the objects into properties that are intrinsic
        * and extrinsic. What that means is shared objects can only really know about themselves then can never hold
        * any state that describes their context. They couldn't because physically it is one object that is representing
        * a thing in various contexts. It's extrinsic state, that is the context in which it exists must be passed into
        * it by the client.
        *
        * In this example I will:
        * Build a little framework for tracking various animals in a Zoo. There will be one Zoo object that has various
        * pens and each pen will contain a number of different animals. I want a big Zoo, so I'm going to have 1000 animals,
        * rather than create 1000 animal objects I will only have 1 object for each kind of animal, these will be my
        * Flyweights, and they will be shared in the Zoo object to represent individual animals.
        * I want to be able to manage my Zoo, so I'll have functions for adding and removing animals, and I'll have a
        * function that prints out to console the current state of the zoo, what animals are in what pens.
        * I'll build a little factory for managing the shared objects, and I'll also make it so the client can't even
        * instantiate animals itself, it must go through the factory.
        * The intrinsic state will be the animals scientific name and a friendly name and the noise it makes. The
        * extrinsic state will be which pen it lives in.
        * */

        Zoo zoo = new Zoo();

        //Create 10000 animals
        for(int i = 0; i < 10000; i++){
            zoo.addAnimal(chooseRandomAnimal());
        }
        zoo.printStatusZoo();
    }

    private static String chooseRandomAnimal() {
        long random = Math.round(Math.random() * (animalTypes.length - 1));
        return animalTypes[(int) random];
    }
}
