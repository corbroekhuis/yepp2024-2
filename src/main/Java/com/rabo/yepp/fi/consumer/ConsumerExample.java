package com.rabo.yepp.fi.consumer;

import com.rabo.yepp.fi.lamp.Lamp;

import java.util.function.Consumer;

public class ConsumerExample {

    Consumer consumer;

    public static void main(String[] args) {

        Consumer<String> consumer = (a) ->  System.out.println(a);

        doSomethingWithConsumer( "Hello", consumer);

        Consumer<Lamp> lampConsumer = l -> {
            System.out.println(l.toString());
            l.toggle();
            System.out.println(l.toString());
        };

        // We pass a functional interface as a parameter
        // We pass 'functionality'
        // This is 'Functional Programming'
        doSomethingWithConsumer( new Lamp(), lampConsumer);

    }

    private static <T> void doSomethingWithConsumer( T t, Consumer<T> consumer){
        consumer.accept(t);
    }
}
