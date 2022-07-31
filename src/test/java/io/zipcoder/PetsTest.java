package io.zipcoder;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

public class PetsTest extends TestCase {

    Pets pet =new Pets();

    ArrayList<Pets> pets = new ArrayList<Pets>();






    public void testCompareTo() {
        pets.add(new Cats("nogi"));
        pets.add(new Dogs("kovu"));
        pets.add(new Cats("ginger"));
        pets.add(new Dogs("Sky"));

    }

    public void testTestGetName() {

        String expected ="kovu";

        pet.setName("kovu");
        String actual = pet.getName();

        Assert.assertEquals(expected,actual);
    }

    public void testTestSetName() {

        String expected= "kovu";
        pet.setName("kovu");
        String actual = pet.getName();

        Assert.assertEquals(expected,actual);}

}