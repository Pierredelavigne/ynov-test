package org.example.tp.s;

public class UserDataManager {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        UserRegistration registration = new UserRegistration(validator);
        UserAuthenticator authenticator = new UserAuthenticator(validator);

        String username = "john_doe";
        String password = "Password123";

        registration.registerUser(username, password);
        authenticator.loginUser(username, password);
    }
}