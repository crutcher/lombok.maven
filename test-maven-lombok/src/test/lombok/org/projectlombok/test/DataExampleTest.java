package org.projectlombok.test;

import org.junit.Assert;
import org.junit.Test;

public class DataExampleTest {

    @Test
    public void testDataExample() {
        String name = "MyData";
        DataExample de = new DataExample(name);
        Assert.assertEquals(de.getName(), name);
    }

}
