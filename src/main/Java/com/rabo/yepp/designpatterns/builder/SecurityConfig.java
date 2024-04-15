package com.rabo.yepp.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class SecurityConfig {

    private List<String> uris = new ArrayList<>();
    private String keystore;
    private String user;
    private String password;
    private boolean tls12;

    private SecurityConfig( boolean tls12){
        this.tls12 = true;
    }

    public static SecurityConfig create( boolean tls12){
        return new SecurityConfig( tls12);
    }

    public SecurityConfig withKeystore( String keystore){
        this.keystore = keystore;
        return this;
    }

    public SecurityConfig withUser( String user){
        this.user = user;
        return this;
    }

    public SecurityConfig withPassword( String password){
        this.password = password;
        return this;
    }

    public SecurityConfig havingTls12( boolean tls12){
        this.tls12 = tls12;
        return this;
    }

    public SecurityConfig build(){
        return this;
    }
}
