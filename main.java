class Shape {
    // Method to calculate area
    double calculateArea() {
        return 0;
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double calculateArea() {
        return length * width;
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {

        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        Shape t = new Triangle(3, 8);

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Triangle Area: " + t.calculateArea());
    }
}
