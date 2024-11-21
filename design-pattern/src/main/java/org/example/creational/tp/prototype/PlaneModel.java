package org.example.creational.tp.prototype;

public class PlaneModel extends Model3D {

    public PlaneModel(String size, String color, String texture) {
        super(size, color, texture);
    }

    @Override
    public void displayModel() {
        System.out.println("Avion - Taille: " + size + ", Couleur: " + color + ", Texture: " + texture);
    }
}
