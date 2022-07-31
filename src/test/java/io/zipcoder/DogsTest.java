package io.zipcoder;

import junit.framework.TestCase;
import org.junit.Assert;

public class DogsTest extends TestCase {
    Dogs d= new Dogs();

    public void testSpeak() {
        String expected = "grrrrr";
        Assert.assertEquals(expected, d.speak());

    }
}