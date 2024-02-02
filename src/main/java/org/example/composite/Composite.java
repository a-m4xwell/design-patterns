package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    @Override
    public void print() {
        for (Component child : children) {
            child.print();
        }
        //Print the contents of the children
    }

    @Override
    public void addChild(Component child) {
        children.add(child);
    }

    @Override
    public void removeChild(Component child) {
        children.remove(child);
    }

    @Override
    public List<Component> getChildren() {
        return children;
    }


}
