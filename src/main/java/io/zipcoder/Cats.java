package io.zipcoder;

public class Cats extends Pets {
    public Cats(String name){
        this.name = name;
    }

    public Cats(){
        super();
    }

    @Override
    public String speak() {
        return "meowww";
    }
}