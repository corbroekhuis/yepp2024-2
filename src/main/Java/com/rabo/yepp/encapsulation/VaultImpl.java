package com.rabo.yepp.encapsulation;

public class VaultImpl implements Vault{

    private String extremelySecretToken;

    @Override
    public void storePassword(String user, String password) {
        String encryptedPassword = encryptPasswordUsingToken( password);
        storePasswordInDatabase( user, encryptedPassword);
    }

    @Override
    public boolean checkPassword(String user, String password) throws Exception {
        return checkPasswordUsingToken(user, password);
    }

    private boolean checkPasswordUsingToken1(String user, String password) {
        String encryptedPassword = encryptPasswordUsingToken( password);
        String storedPassword = getPasswordFromDatabase( user);
        return encryptedPassword.equals(storedPassword);
    }

    private boolean checkPasswordUsingToken(String user, String password) throws Exception {
        String encryptedPassword = encryptPasswordUsingToken( password);
        String storedPassword = getPasswordFromDatabase( user);

        if(!encryptedPassword.equals(storedPassword)){
            throw new Exception("Passwords don't match");
        }

        return true;
    }

    private String encryptPasswordUsingToken(String password) {
        // Encrypt password using token;
        return "DKKGHEIOWPTUITJDKWOW";
    }

    private void storePasswordInDatabase(String user, String encryptedPassword) {
        // Store password in database
    }

    private String getPasswordFromDatabase(String user) {
        // Get password from database
        return "DKKGHEIOWPTUITJDKWOW";
    }
}
