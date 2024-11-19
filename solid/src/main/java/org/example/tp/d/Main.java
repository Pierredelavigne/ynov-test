package main.java.org.example.tp.d;

public class Main {
    public static void main(String[] args) {
        Engine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.start();

        Engine gasolineEngine = new GasolineEngine();
        Car gasolineCar = new Car(gasolineEngine);
        gasolineCar.start();
    }
}