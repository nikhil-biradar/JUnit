package org.example.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJUnit5 {

    @BeforeAll
    public static void init(){
        System.out.println("Execute before all test cases");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Execute before each test case");
    }

    @Test
    public void addTwoNumbers(){
        System.out.println("First Test Case");
        int result = CalculatorService.addTwoNumbers(10, 50);
        Assertions.assertEquals(60, result, "result should be 60");
    }

    @Test
    public void productTwoNumbers(){
        int result = CalculatorService.productTwoNumbers(5, 5);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void divideTwoNumbers(){
        int result = CalculatorService.divideTwoNumbers(50, 5);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void addAnyNumbers(){
        int result = CalculatorService.sumAnyNumbers(10, 20, 30, 40, 50);
        Assertions.assertEquals(150, result);
    }

    @AfterEach
    public void cleanUp(){
        System.out.println("Execute after each test case");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Execute aftetr all test cases");
    }
}
