package com.rabo.yepp.polymorphism;

public class Musician extends Artist {

    @Override
    public void perform(){
        System.out.println("Make music all night");
    }
}
