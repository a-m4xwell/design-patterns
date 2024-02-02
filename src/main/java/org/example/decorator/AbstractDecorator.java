package org.example.decorator;

public abstract class AbstractDecorator implements Room{
    protected Room component;

    public AbstractDecorator(Room component){
        this.component = component;
    }
}
