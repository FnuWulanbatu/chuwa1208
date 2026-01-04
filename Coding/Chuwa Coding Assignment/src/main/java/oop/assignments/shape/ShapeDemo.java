package oop.assignments.shape;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] { new Rectangle(3.0, 4.0), new Circle(2.0) };

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}




