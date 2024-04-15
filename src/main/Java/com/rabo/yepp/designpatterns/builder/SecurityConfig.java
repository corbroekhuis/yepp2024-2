package com.rabo.yepp.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class SecurityConfig {

    private List<String> securedUris= new ArrayList<>();
    private List<String> allowedUris = new ArrayList<>();
    private String keystore;
    private String user;
    private String password;
    private boolean tls12;

    private SecurityConfig( boolean tls12){
        this.tls12 = tls12;
    }

    public static SecurityConfig create( boolean tls12){
        return new SecurityConfig( tls12);
    }

    public SecurityConfig secureUri( String uri){
        securedUris.add(uri);
        return this;
    }

    public SecurityConfig allowUri( String uri){
        allowedUris.add(uri);
        return this;
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

    @Override
    public String toString() {
        return "SecurityConfig{" +
                "securedUris=" + securedUris +
                ", allowedUris=" + allowedUris +
                ", keystore='" + keystore + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", tls12=" + tls12 +
                '}';
    }
}
