package com.rabo.yepp.lambda;

@FunctionalInterface
interface VoidOperation{
    void operate( Car car);
}

class Car{
    void start(){
        System.out.println("Car started");
    }
    void stop(){
        System.out.println("Car stopped");
    }
    void honk(){
        System.out.println("Car is honking");
    }

    public String toString(){
        return "Very fast electric red car";
    }
}

public class Exercise03 {

    public static void main(String[] args) {

        // Create several lambda's for this interface
        // Here's an example
        VoidOperation voidOperation;

        voidOperation = car -> car.start();

        //Note that this strange looking (and useless) lambda also complies to the interface
        voidOperation = car -> {};

        // Create lambda that calls method printCarDetails


    }

    private static void printCarDetails( Car car){
        System.out.println( car.toString());
    }


}

