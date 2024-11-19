package org.example.tp.s;

class UserValidator {
    public boolean validateUsername(String username) {
        return username.length() >= 5 && username.matches("[a-zA-Z_0-9]+");
    }

    public boolean validatePassword(String password) {
        return password.length() >= 8 && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    }
}
