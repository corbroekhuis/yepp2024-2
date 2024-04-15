package com.rabo.yepp.encapsulation;

public class Application {

    public static void main(String[] args) {

        Vault vault = new VaultImpl();
        vault.storePassword("user", "Secret#01");

        try {
            boolean valid = vault.checkPassword( "user", "Secret#01");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
