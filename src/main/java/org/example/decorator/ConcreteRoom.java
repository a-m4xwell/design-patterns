package org.example.decorator;

public class ConcreteRoom implements Room{
    private String size;
    public ConcreteRoom(String size){
        this.size = size;
    }
    @Override
    public String getDescription() {
        return "I am a room and I am " + size;
    }
}
