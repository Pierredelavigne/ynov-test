package org.example.tp.s;

class UserAuthenticator {
    private UserValidator validator;

    public UserAuthenticator(UserValidator validator) {
        this.validator = validator;
    }

    public void loginUser(String username, String password) {
        if (validator.validateUsername(username) && validator.validatePassword(password)) {
            System.out.println("Utilisateur connecté avec succès.");
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }
}
