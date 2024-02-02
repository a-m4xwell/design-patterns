package org.example.composite;

import java.util.List;

public abstract class Component {

    //Adds a child to the component, must be overwritten in Composite classes
    public void addChild(Component child){
        throw new RuntimeException("This component cannot have children");
    }
    //Removes a child from the component, must be overwritten in Composite classes
    public void removeChild(Component child){
        throw new RuntimeException("This component has no children");
    }
    //Returns the list of children that compose the component, must be overwritten in the Composite class
    public List<Component> getChildren(){
        throw new RuntimeException("This component has no children");
    }
    //Prints the contents of the component to the console
    public abstract void print();

    //Sets the data held by the component, must be overriden by the Leaf class
    public void setData(String data){
        throw new RuntimeException("This component cannot hold data");
    }
}
