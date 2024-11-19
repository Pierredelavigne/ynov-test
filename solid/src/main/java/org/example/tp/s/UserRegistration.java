package org.example.tp.s;

class UserRegistration {
    private UserValidator validator;

    public UserRegistration(UserValidator validator) {
        this.validator = validator;
    }

    public void registerUser(String username, String password) {
        if (validator.validateUsername(username) && validator.validatePassword(password)) {
            System.out.println("Utilisateur enregistré avec succès.");
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }
}