package org.example.composite;

public class Leaf extends Component{

    private String data;

    @Override
    public void print() {
        System.out.println(data);
    }

    @Override
    public void setData(String data){
        this.data = data;
    }
}
