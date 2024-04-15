package com.rabo.yepp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Example {

    static List<String> emailAddresses = new ArrayList<>();

    public static void main(String[] args) {

        emailAddresses.add("john@rabo.nl");
        emailAddresses.add("joanna@rabo.nl");
        emailAddresses.add("chris@rabo.nl");
        emailAddresses.add("jane#rabo.nl");
        // add more if you want

        // 1 forEach
        // Create stream (of email addresses) from the list and check/display every email address, using a lambda
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
        Optional<String> emailToFind = emailAddresses.stream()
                .filter( email -> email.startsWith("john"))
                .findAny();

    }

    private static void checkEmail( String email){
        if( email.contains("@")){
            System.out.println(email + " correct");
        }else{
            System.out.println(email + " not correct");
        }
    }
}
