package main.java.org.example.tp.l;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        setSide(side);
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be greater than zero.");
        }
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}
