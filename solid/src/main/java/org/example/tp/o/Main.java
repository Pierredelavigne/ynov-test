package main.java.org.example.tp.o;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        // Shape rectangle = new Rectangle(4, 6);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        //shapes.add(rectangle);

        ShapeCalculator calculator = new ShapeCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.println("TotalArea is : " + totalArea);
    }
}