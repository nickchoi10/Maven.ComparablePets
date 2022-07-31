package io.zipcoder;

public class Dogs extends Pets {
    public Dogs (String name){
        this.name =name;
    }

    public Dogs(){
        super();
    }
    @Override
    public String speak() {
        return "grrrrr";

    }
}



