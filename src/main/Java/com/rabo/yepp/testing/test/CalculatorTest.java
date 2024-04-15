package com.rabo.yepp.testing.test;

import com.rabo.yepp.testing.service.Calculator;
import com.rabo.yepp.testing.annotation.BeforeEach;
import com.rabo.yepp.testing.annotation.Test;
import com.rabo.yepp.testing.assertion.Assertions;

public class CalculatorTest {

    @BeforeEach
    public void init(){
        Calculator.reCharge();
    }

    @Test(testComment = "This is the first Test")
    public void testAdd(){
        int actual = Calculator.add( 3, 7);
        Assertions.assertEquals( 10, actual);
    }

    @Test(testComment = "This is the second Test")
    public void testSubtract(){
        int actual = Calculator.subtract( 7, 2);
        Assertions.assertEquals( 5, actual);
    }

    @Test(testComment = "This is the third Test")
    public void testMultiply(){
        int actual = Calculator.multiply( 3, 7);
        Assertions.assertEquals( 21, actual);
    }

    @Test
    public void testEven(){
        boolean actual = Calculator.isEven( 24);
        Assertions.assertEquals( true, actual);
        Assertions.assertTrue( actual);
    }

    @Test(skip = true)
    public void testPositive(){
        boolean actual = Calculator.isPositive( 5);
        Assertions.assertEquals( true, actual);
        Assertions.assertTrue( actual);
    }

    @Test(testComment = "This test will fail")
    public void testPositiveFail(){
        boolean actual = Calculator.isPositive( -5);
        Assertions.assertEquals( false, actual);
        Assertions.assertTrue( actual);
    }
}
