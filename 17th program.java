abstract class Shape {
    // Abstract method (does not have a body)
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class ShapeAbstraction {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw();

        Shape shape2 = new Rectangle();
        shape2.draw();
    }
}
