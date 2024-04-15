package com.rabo.yepp.streams;

import java.util.ArrayList;
import java.util.List;

public class Example {

    static List<String> emailAddresses = new ArrayList<>();

    public static void main(String[] args) {

        emailAddresses.add("john@rabo.nl");
        emailAddresses.add("joanna@rabo.nl");
        emailAddresses.add("chris@rabo.nl");
        emailAddresses.add("jane#rabo.nl");
        // add more if you want

        // ! forEach
        // Create stream (of Strings) from list and display every email, using a lambda
        emailAddresses.stream()
                .forEach( email -> checkEmail(email) );

        // 2 filter
        // You can't reuse a stream, so create another one
        // apply a filter and catch the filtered elements in a new List
        List<String> emailsStartingWithJ = emailAddresses.stream()
                .filter( email -> email.startsWith("j"))
                .toList();
        System.out.println(emailsStartingWithJ);

        // 3 findAny
        // find john's email
        String emailToFind = emailAddresses.stream()
                .filter( email -> email.startsWith("john"))
                .findAny()
                .orElse(null);

    }

    private static void checkEmail( String email){
        if( email.contains("@")){
            System.out.println(email + " correct");
        }else{
            System.out.println(email + " not correct");
        }
    }
}
