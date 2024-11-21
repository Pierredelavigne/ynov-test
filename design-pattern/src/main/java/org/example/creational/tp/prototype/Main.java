package org.example.creational.tp.prototype;

public class Main {
    public static void main(String[] args) {
        // Créa d'un modèle de maison
        HouseModel house = new HouseModel("Grande", "Rouge", "Brique");
        house.displayModel();

        // Dup du modèle de maison
        HouseModel copiedHouse = (HouseModel) house.clone();
        copiedHouse.setColor("Bleu");
        copiedHouse.displayModel();

        // Créa d'un modèle de voiture
        CarModel car = new CarModel("Compacte", "Noir", "Métallique");
        car.displayModel();

        // Dup du modèle de voiture
        CarModel copiedCar = (CarModel) car.clone();
        copiedCar.setSize("SUV");
        copiedCar.displayModel();

        // Créa d'un modèle d'avion
        PlaneModel plane = new PlaneModel("Gigantesque", "Blanc", "Lisse");
        plane.displayModel();

        // Dup du modèle d'avion
        PlaneModel copiedPlane = (PlaneModel) plane.clone();
        copiedPlane.setTexture("Mat");
        copiedPlane.displayModel();
    }
}
