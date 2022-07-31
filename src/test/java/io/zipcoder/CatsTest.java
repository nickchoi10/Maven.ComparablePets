package io.zipcoder;

import junit.framework.TestCase;
import org.junit.Assert;

public class CatsTest extends TestCase {

    public void testSpeak() {
        Cats c =new Cats();
        String expected = "meowww";
        Assert.assertEquals(expected,c.speak());
    }
}