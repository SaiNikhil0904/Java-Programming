import java.util.*;

class FanDetails {
    int speed;
    boolean fanOn;
    double radius;
    String color;

    FanDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color: ");
        color = sc.next();
        System.out.print("Enter the Radius: ");
        radius = sc.nextDouble();
        System.out.print("Enter the State (true for ON, false for OFF): ");
        fanOn = sc.nextBoolean();

        if (fanOn) {
            System.out.print("Enter the Speed: ");
            speed = sc.nextInt();
        }
        sc.close();
    }

    void display() {
        if (fanOn) {
            System.out.println("Fan is: ON");
            System.out.println("Fan Speed: " + speed);
            System.out.println("Fan Color: " + color);
            System.out.println("Fan Radius: " + radius);
        } else {
            System.out.println("Fan is: OFF");
            System.out.println("Fan Color: " + color);
            System.out.println("Fan Radius: " + radius);
        }
    }

    public static void main(String args[]) {
        FanDetails fan = new FanDetails();
        fan.display();
    }
}