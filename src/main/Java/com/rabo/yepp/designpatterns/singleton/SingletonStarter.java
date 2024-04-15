package com.rabo.yepp.designpatterns.singleton;

public class SingletonStarter {

    public static void main(String[] args) {

        SingletonService singletonService = SingletonService.getInstance();
        SingletonService.getInstance().process();
        singletonService = SingletonService.getInstance();
        singletonService.process();

        SingletonService.getInstance().process();



    }
}
