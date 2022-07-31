package io.zipcoder;

public class Rabbits extends Pets {
    public Rabbits(String name){
        this.name = name;
    }

    public Rabbits(){
        super();
    }

    @Override
    public String speak(){
        return "ribbit";
    }
}