package com.rabo.yepp.lambda;

@FunctionalInterface
interface ComplexMathematicalOperation{
    int operation( int operand1, int operand2);
}

public class Exercise02 {

    public static void main(String[] args) {

        // Create several lambda's for this interface
        // Here's an example
        ComplexMathematicalOperation complexathematicalOperation;

        complexathematicalOperation = (n, m) -> n + m;  // We need brackets now because we have to parameters


        // Add a method that takes a lambda as a parameter and us it


    }
}
