package org.example.decorator;

public class WallDecorator extends AbstractDecorator{
    public WallDecorator(Room component) {
        super(component);
    }

    @Override
    public String getDescription() {
        return component.getDescription() + " and I have lime green walls";
    }
}
