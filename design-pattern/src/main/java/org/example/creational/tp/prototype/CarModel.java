package org.example.creational.tp.prototype;

public class CarModel extends Model3D {

    public CarModel(String size, String color, String texture) {
        super(size, color, texture);
    }

    @Override
    public void displayModel() {
        System.out.println("Voiture - Taille: " + size + ", Couleur: " + color + ", Texture: " + texture);
    }
}
