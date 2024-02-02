package org.example.decorator;

public class FurnitureDecorator extends AbstractDecorator{
    public FurnitureDecorator(Room component) {
        super(component);
    }

    @Override
    public String getDescription() {
        return component.getDescription() + " and I have 2 sofas and a coffee table";
    }
}
