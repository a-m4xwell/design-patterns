package org.example.composite;

public class Main {
    /*The intent of the Composite pattern is to compose objects into tree structures to represent part-whole
    hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly

    In this example I will seek to represent a basic tree structure that contains composites and leafs, the leafs will
    hold a string
    */
    public static void main(String[] args) {
        //Setup
        Leaf helloLeaf = new Leaf();
        helloLeaf.setData("Hello");

        Leaf spaceLeaf = new Leaf();
        spaceLeaf.setData("\\s");

        Leaf worldLeaf = new Leaf();
        worldLeaf.setData("World");

        Composite base = new Composite();
        base.addChild(worldLeaf);

        Composite mid = new Composite();
        mid.addChild(spaceLeaf);
        mid.addChild(base);

        Composite root = new Composite();
        root.addChild(helloLeaf);
        root.addChild(mid);

        //Client code
        root.print();
    }
}
