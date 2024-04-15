package com.rabo.yepp.streams;

import java.util.ArrayList;
import java.util.List;

class Car{
    String make;
    String model;
    String color;
    boolean electric;
    int age;

    public Car(String make, String model, String color, boolean electric, int age) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.electric = electric;
        this.age = age;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isElectric() {
        return electric;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", electric=" + electric +
                ", age=" + age +
                '}';
    }
}


public class Exercise02 {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add( new Car("BMW","3i","Red", true, 6));
        cars.add( new Car("VW","Beetle","White", false, 26));
        cars.add( new Car("VW","Golf","Black", false, 13));
        cars.add( new Car("Tesla","Model S","Black", true, 2));
        cars.add( new Car("Toyota","Aygo","Red", false, 9));
        cars.add( new Car("Toyota","Yaris","Taupe", true, 2));
        cars.add( new Car("BMW","X4","White", true, 3));

        // Create stream and use forEach to print all cars (using method)

        // Create stream and use 2 filters to collect red cars older than 4 years

        // Create stream and use findAny to find the first black car

    }

    private static void printCar( Car car){
        System.out.println( car.toString());
    }
}
