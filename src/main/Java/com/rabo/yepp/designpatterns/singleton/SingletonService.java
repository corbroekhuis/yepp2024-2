package com.rabo.yepp.designpatterns.singleton;

public class SingletonService {

    private static SingletonService singletonService = new SingletonService();

    private SingletonService(){}

    public void process(){

        System.out.println("processing");
    }

    public static SingletonService getInstance(){

//        if(singletonService == null){
//            singletonService = new SingletonService();
//        }

        return singletonService;
    }
}
