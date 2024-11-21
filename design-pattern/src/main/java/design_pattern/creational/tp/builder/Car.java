package main.java.design_pattern.creational.tp.builder;

import java.text.ListFormat;
import java.util.ArrayList;
import java.util.List;

public class Car {

    //obligatoires
    private final String model;
    private final String engine;
    private final int seats;


    //optionnels
    private final String color;
    private final List<String> extras;


    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.color = builder.color;
        this.extras = builder.extras;
    }

    public void displayCar() {
        System.out.println("Car Details:");
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engine);
        System.out.println("Seats: " + seats);
        System.out.println("Color: " + color);
        System.out.println("Extras: " + String.join(", ", extras));
    }

    public static class CarBuilder {
        // obligatoires
        private String model;
        private String engine;
        private int seats;

        // optionnels
        private String color = "undefined";
        private List<String> extras = new ArrayList<>();

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }
        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }
        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        public CarBuilder setExtra(String extra) {
            this.extras.add(extra);
            return this;
        }

        public Car build() {
            validateCar();
            return new Car(this);
        }

        // Méthode de validation des contraintes
        private void validateCar() {
            if (model == null || engine == null || seats <= 0) {
                throw new IllegalStateException("Model, engine, and seats must be defined.");
            }
            if (model.equalsIgnoreCase("Sport") && engine.equalsIgnoreCase("Électrique")) {
                throw new IllegalStateException("Sport models cannot have an electric engine.");
            }
            if (model.equalsIgnoreCase("SUV") && seats < 5) {
                throw new IllegalStateException("SUV models must have at least 5 seats.");
            }
        }
    }
}
