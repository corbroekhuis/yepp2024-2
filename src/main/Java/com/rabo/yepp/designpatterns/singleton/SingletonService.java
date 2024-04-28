package com.rabo.yepp.designpatterns.singleton;

public class SingletonService {

    private static SingletonService singletonService;

    private SingletonService(){}

    public void process(){
        System.out.println("Instance " + this.toString() + " is processing");
    }

    public static SingletonService getInstance(){

        if(singletonService == null){
            singletonService = new SingletonService();
        }

        return singletonService;
    }
}
