import java.util.*;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        double radius = sc.nextDouble();

        double pi = 3.14;
        double area = pi * radius * radius;
        double perimeter = 2 * pi * radius;

        System.out.println("The Area of the Circle is: " + area);
        System.out.println("The Perimeter of the Circle is: " + perimeter);

        sc.close();
    }
}