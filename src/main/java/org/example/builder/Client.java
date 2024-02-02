package org.example.builder;

import org.example.builder.builder.CessnaBuilder;
import org.example.builder.builder.ShuttleBuilder;
import org.example.builder.product.ga.GaFuselage;
import org.example.builder.product.shuttle.ShuttleFuselage;

public class Client {
    public static void main(String[] args) {
        /*
        * The builder pattern separates the construction of a complex object from its representation so that the same
        * construction process can create different representations
        *
        * The director defines the construction process and the concrete builder does the actual building and stores
        * the representation of the object
        *
        * GOAL
        * implement the builder pattern to create 2 distinct objects with their own unique classes that follow the same
        * construction process
        * object 1 will be a Cessna 172
        * object 2 will be a Space Shuttle
        *
        * In this example I am getting the constructed product via the concrete builder but it would also be viable to
        * have another operation on the Builder interface to get the product. A generic Object would be returned but
        * given that the client knows the builder in use its safe to downcast to a lower class
        * */

        //Build a Cessna
        CessnaBuilder cessnaBuilder = new CessnaBuilder();
        AerospaceDirector aerospaceDirector = new AerospaceDirector(cessnaBuilder);

        aerospaceDirector.constructVehicle();

        GaFuselage cessna = cessnaBuilder.getFuselage();
        System.out.println("The plane is a " + cessna.getMake() + " " + cessna.getModel());

        //Build Shuttle
        ShuttleBuilder shuttleBuilder = new ShuttleBuilder();
        aerospaceDirector = new AerospaceDirector(shuttleBuilder);
        aerospaceDirector.constructVehicle();
        ShuttleFuselage shuttle = shuttleBuilder.getFuselage();
        System.out.println("Constructed Space Shuttle " + shuttle.getName());
    }
}
