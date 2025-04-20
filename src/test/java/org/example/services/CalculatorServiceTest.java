package org.example.services;

import org.junit.*;
import java.util.Date;

public class CalculatorServiceTest {

    @BeforeClass //This will execute before all test cases
    public static void init(){
        System.out.println("Before all test cases : ");
        System.out.println("Started : " + new Date());
    }

   @Before //Executes before each test case
    public void beforeEach(){
        System.out.println("Executes before each test case : ");
    }

    @After //Executes before each test case
    public void afterEach(){
        System.out.println("Executes after each test case : ");
    }

    @Test(timeout = 3000) //It will take only 3 seconds to test the testcase
    public void addTwoNumbersTest() throws InterruptedException{
        Thread.sleep(2000);
        int result = CalculatorService.addTwoNumbers(10, 10);
        Assert.assertEquals(20, result);
    }

    @Test
    public void multiplyTwoNumbersTest(){
        int result = CalculatorService.productTwoNumbers(10, 20);
        Assert.assertEquals(200, result);
    }

    @Test
    public void divideTwoNumbersTest(){
        int result = CalculatorService.divideTwoNumbers(20, 10);
        Assert.assertEquals(2, result);
    }

    @Test
    public void sumAnyNumbersTest(){
        int result = CalculatorService.sumAnyNumbers(10, 20, 30);
        Assert.assertEquals(60, result);
    }

    @AfterClass //After all test cases
    public static void cleanUp(){
        System.out.println("After all test cases : ");
        System.out.print("Test cases end : " + new Date());
    }
}
