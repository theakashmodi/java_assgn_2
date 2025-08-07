abstract class Shape {
    abstract void calculateArea();
    void display() {
        System.out.println("Displaying shape area...");
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void calculateArea() {
        display();
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    void calculateArea() {
        display();
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

public class assgn2_1 {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 5);
        c.calculateArea();
        r.calculateArea();
    }
}
