package org.example.creational.tp.prototype;

public class HouseModel extends Model3D {
    public HouseModel(String size, String color, String texture) {
        super(size, color, texture);
    }

    @Override
    public void displayModel() {
        System.out.println("Maison - Taille: " + size + ", Couleur: " + color + ", Texture: " + texture);
    }
}