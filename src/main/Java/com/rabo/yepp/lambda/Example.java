package com.rabo.yepp.lambda;

// interface StringFormatter is a 'FunctionalInterface'
// It can have only one method definition
// The method describes this functionality:
// A String comes in, a string is returned
// The compiler only needs this information, the name is not relevant
// We can construct lambda expressions that comply to this method
//

@FunctionalInterface
interface StringFormatter{
    String format( String toFormat);
}

public class Example {

    public static void main(String[] args) {

        StringFormatter formatter;

        // The compiler knows that s must be a String. Also that a String is returned
        formatter = s -> s.toLowerCase();
        // This is the same
        formatter = (s) -> { return s.toLowerCase();};
        // Another example
        formatter = s -> "Hello " + s;

        // We can pass a lambda as a parameter in a method
        useLambda(  formatter, "World!" );

        // Now, try the exercises


    }

    private static void useLambda( StringFormatter stringFormatter, String toFormat){
        String formattedString = stringFormatter.format( toFormat);
        System.out.println(formattedString);
    }
}
