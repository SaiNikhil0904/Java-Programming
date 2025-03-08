import java.util.*;

class Shape {
    void area(int a) {
        double area = a * a;
        System.out.println("Base Calling Area of Square: " + area);
    }

    void area(int a, int b) {
        double area = a * b;
        System.out.println("Base Calling Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    void area(int a, int b) {
        super.area(a);
        double area = (3.14 * a * a);
        System.out.println("Derived Calling Area of Circle: " + area);
        super.area(a, b);
    }
}

public class ShapeAreaCalculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second Number: ");
        int b = sc.nextInt();
        Circle c = new Circle();
        c.area(a, b);
        sc.close();
    }
}