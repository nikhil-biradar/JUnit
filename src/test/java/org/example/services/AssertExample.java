package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class AssertExample {
    @Test
    public void test1(){
        String name = "Nikhil";
        String expectedName = new String("Nikhil").intern();

        Assertions.assertSame(name, expectedName);
        Assertions.assertEquals(name, expectedName);

        boolean value = true;
        Assertions.assertTrue(value);

        boolean value1 = false;
        Assertions.assertFalse(value1);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = Arrays.asList(1, 2, 3,4, 5);
        Assertions.assertIterableEquals(list1, list);

    }
}