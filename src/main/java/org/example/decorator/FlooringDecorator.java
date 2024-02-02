package org.example.decorator;

public class FlooringDecorator extends AbstractDecorator {
    public FlooringDecorator(Room component) {
        super(component);
    }
    @Override
    public String getDescription() {
        return component.getDescription() + " and I have wooden flooring";
    }
}
