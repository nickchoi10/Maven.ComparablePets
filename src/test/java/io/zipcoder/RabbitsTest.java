package io.zipcoder;

import junit.framework.TestCase;
import org.junit.Assert;

public class RabbitsTest extends TestCase {

    public void testSpeak() {

        Rabbits rabbit = new Rabbits();
        String expected ="ribbit";
        String actual = rabbit.speak();

        Assert.assertEquals(expected,actual);
    }
}