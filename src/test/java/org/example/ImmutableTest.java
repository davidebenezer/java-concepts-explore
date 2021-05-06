package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ImmutableTest {
    @Test
    public void testImmutableClass(){
        String name="Paul";
        int age = 42;
        String testName = "Raul";
        Immutable.FinalTest finalTest = new Immutable.FinalTest(testName);
        Immutable immutable = new Immutable(name, 42, finalTest);
        //String values are same
        Assert.assertEquals(immutable.getName(), name);
        //Objects are different since we instantiate the String intentionally inside the Immutable class
        Assert.assertNotSame(immutable.getName(), name);
        Assert.assertEquals(immutable.age, age);
        Assert.assertEquals(testName, immutable.getFinalTest().getTestName());

    }
}