package org.example.services;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AssertExample {
    @Test
    public void test1(){
        String name = "Nikhil";
        String expectedName = new String("Nikhil").intern();
        assertSame(name, expectedName);
        assertEquals(name, expectedName);

        boolean value = true;
        assertTrue(value);

        boolean value1 = false;
        assertFalse(value1);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = Arrays.asList(1, 2, 3,4, 5);
        assertIterableEquals(list1, list);

    }
}