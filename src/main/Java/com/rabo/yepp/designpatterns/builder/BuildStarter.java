package com.rabo.yepp.designpatterns.builder;

public class BuildStarter {

    public static void main(String[] args) {

        SecurityConfig securityConfig = SecurityConfig.create( false)
                .withKeystore("")
                .withUser("me")
                .withPassword("secret")
 //               .havingTls12(true)
                .build();
    }
}
