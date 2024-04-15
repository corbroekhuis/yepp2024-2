package com.rabo.yepp.testing;

import com.rabo.yepp.testing.test.CalculatorTest;

public class Application {

    public static void main(String[] args) {

        TestFrameWork.runTests(CalculatorTest.class);
    }
}
