package org.example.decorator;

public class Main {

    /*Decorator is used to recursively add behaviour to an object, It's design means this can be done dynamically at
    runtime. They are a flexible alternative to subclassing

    In this example I will have a room object that is recursively decorated with furniture and wall coverings*/

    public static void main(String[] args) {
        //Setup

        Room room = new ConcreteRoom("9ft by 12ft");
        FlooringDecorator flooringDecorator = new FlooringDecorator(room);
        WallDecorator wallDecorator = new WallDecorator(flooringDecorator);
        FurnitureDecorator furnitureDecorator = new FurnitureDecorator(wallDecorator);

        //Implementation

        //Casting this to a Room to highlight the transparency of this pattern. Clients and the root object are completely
        // unaware or any decorators
        Room myRoom = (Room) furnitureDecorator;
        System.out.println(myRoom.getDescription());
    }
}
