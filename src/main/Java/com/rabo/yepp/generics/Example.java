package com.rabo.yepp.generics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

interface Vehicle{
    void start();
}

class Car implements Vehicle {

    @JsonProperty("kleur")
    private String color;

    public Car(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void start() {

    }
}
class Motorcycle implements Vehicle{

    private String color;

    public Motorcycle(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void start() {

    }
}

// Generic class
class Box<T extends Vehicle> {

    List<T> items = new ArrayList<>();
    // T is already 'declared'
    void addItem( T t){
        t.start();
        items.add( t);
    }
    T getItem( int index){
        return items.get( index);
    }

    public List<T> getItems() {
        return items;
    }
}

// class with generic method
class VehicleCharger{
    // Method needs to 'declare' T
    static <T extends Vehicle> void charge(T t){

    }
}

public class Example {

    public static void main(String[] args) {

//        Box<Integer> box = new Box<>();
//        box.addItem(1);
//        box.addItem(2);
//        box.addItem(3);
//        box.addItem(4);
//        box.addItem(5);
//
//        for ( int i: box.getItems()){
//            System.out.println( i);
//        }

        Box<Car> carBox = new Box<>();
        carBox.addItem(new Car("Red"));
        carBox.addItem(new Car("Yellow"));
        carBox.addItem(new Car("Green"));
        carBox.addItem(new Car("White"));

        for ( Car car: carBox.getItems()){
            System.out.println( car);
        }

        Vehicle motorcycle = new Motorcycle("Black");
        Vehicle car = new Car("Purple");
        VehicleCharger.charge( motorcycle);
        VehicleCharger.charge( car);

        motorcycle.start();
        car.start();


        Box<Motorcycle> motorcycleBox = new Box<>();

        Box<Vehicle> vehicles = new Box<>();
        vehicles.addItem(car);
        vehicles.addItem(motorcycle);


    }

}
