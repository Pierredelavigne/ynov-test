package org.example.creational.prototype.avecproto;

public class Square implements ShapePrototype{

    private String color;
    private int side;

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public ShapePrototype clone() {
        return new Square(color, side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", side=" + side +
                '}';
    }
}
