package io.zipcoder;


import java.util.Comparator;

public class Pets implements Comparable<Pets>, Comparator<Pets> {
    public String name;
    public void Pets(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String setName(String name){ return this.name=name;}

    public String speak() {
        return "";
    }

    public int compareTo(Pets pet) {
        return pet.name.compareTo(this.name);
    }

    public int compare(Pets pet1, Pets pet2) {
        return pet1.compareTo(pet2);
    }
}


