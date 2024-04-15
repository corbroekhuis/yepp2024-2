package com.rabo.yepp.designpatterns.builder;

public class BuildStarter {

    public static void main(String[] args) {

        SecurityConfig securityConfig = SecurityConfig.create( false)
                .secureUri("/api/transaction")
                .secureUri("/api/user")
                .secureUri("/api/login")
                .allowUri("/js/**")
                .allowUri("/css/**")
                .withKeystore("path to keystore file (which contains certificate)")
                .withUser("me")
                .withPassword("secret")
 //               .havingTls12(true)
                .build();

        System.out.println(securityConfig);
    }
}
