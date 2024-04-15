package com.rabo.yepp.lambda;

@FunctionalInterface
interface MathematicalOperation{
    int operation( int operand);
}

public class Exercise01 {

    public static void main(String[] args) {

        // Create several lambda's for this interface
        // Here's an example
        MathematicalOperation mathematicalOperation;

        mathematicalOperation = n -> -n;


        // Add a method that takes a lambda as a parameter and uses it


    }
}
