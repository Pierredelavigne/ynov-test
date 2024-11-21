package main.java.design_pattern.creational.tp.builder;

public class Demo {
    public static void main(String[] args) {
        try {
            // Construction d'un SUV valide
            Car suv = new Car.CarBuilder()
                    .setModel("SUV")
                    .setEngine("Hybride")
                    .setSeats(7)
                    .setColor("Bleu")
                    .addExtra("GPS")
                    .addExtra("Toit ouvrant")
                    .build();
            suv.displayCar();
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }

        try {
            // Tentative de construction d'un modèle Sport avec un moteur électrique (erreur)
            Car sportCar = new Car.CarBuilder()
                    .setModel("Sport")
                    .setEngine("Électrique")
                    .setSeats(2)
                    .setColor("Rouge")
                    .build();
            sportCar.displayCar();
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }

        try {
            // Tentative de construction d'un SUV avec moins de 5 sièges (erreur)
            Car invalidSuv = new Car.CarBuilder()
                    .setModel("SUV")
                    .setEngine("Essence")
                    .setSeats(4)
                    .setColor("Noir")
                    .build();
            invalidSuv.displayCar();
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
