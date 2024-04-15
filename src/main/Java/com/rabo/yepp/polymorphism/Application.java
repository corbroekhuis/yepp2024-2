package com.rabo.yepp.polymorphism;

public class Application {

    public static void main(String[] args) {

        Artist dancer = new Danser();
        Artist musician = new Musician();

        // Polymorphism
        // a dancer and musician are both artists and can perform
        // but their performance is different

        dancer.perform();
        musician.perform();

    }
}
