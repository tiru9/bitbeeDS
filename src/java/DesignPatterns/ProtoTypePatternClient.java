package DesignPatterns;

import java.util.HashMap;
import java.util.Map;

// Prototype Interface
interface Shape extends Cloneable {
    Shape cloneShape();
    void draw();
}
// Concrete Prototype: Circle
class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape cloneShape() {
        return new Circle(this.radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}
// Concrete Prototype: Rectangle
class Rectangle implements Shape {
    private int width, height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape cloneShape() {
        return new Rectangle(this.width, this.height);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width: " + width + " and height: " + height);
    }
}

// Prototype Registry
class ShapeRegistry {
    private Map<String, Shape> shapeMap = new HashMap<>();

    public void registerShape(String key, Shape shape) {
        shapeMap.put(key, shape);
    }

    public Shape getShape(String key) {
        return shapeMap.get(key).cloneShape();
    }
}

// Client Code
public class ProtoTypePatternClient {
    public static void main(String[] args) {
        ShapeRegistry registry = new ShapeRegistry();

        // Register Prototypes
        registry.registerShape("Circle", new Circle(10));
        registry.registerShape("Rectangle", new Rectangle(20, 30));

        // Create Clones
        Shape clonedCircle = registry.getShape("Circle");
        clonedCircle.draw(); // Output: Drawing a Circle with radius: 10

        Shape clonedRectangle = registry.getShape("Rectangle");
        clonedRectangle.draw(); // Output: Drawing a Rectangle with width: 20 and height: 30
    }
}

