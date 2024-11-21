package org.example.creational.tp.prototype;

public abstract class Model3D implements Cloneable {
    protected String size;
    protected String color;
    protected String texture;

    public Model3D(String size, String color, String texture) {
        this.size = size;
        this.color = color;
        this.texture = texture;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    @Override
    public Model3D clone() {
        try {
            return (Model3D) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erreur lors de la duplication du modèle.", e);
        }
    }

    public abstract void displayModel();
}
