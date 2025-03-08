import java.util.Scanner;

class Animals {
    void sleep() {
        System.out.println("Zzzzzzzz");
    }

    void Noise() {
        System.out.println("Grrrr");
    }

    void roam() {
        System.out.println("Roaming near water");
    }
}

class Lion extends Animals {
    void Noise() {
        System.out.println("Roar: Rrrrrrrrr");
    }
}

class Cat extends Animals {
    void Noise() {
        System.out.println("Meow Meow");
    }
}

class Wolf extends Animals {
    void Noise() {
        System.out.println("Howling: Ouooooo!");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        int x;
        Scanner s = new Scanner(System.in);
        System.out.println("1. Wolf  2. Lion  3. Cat  4. Wolf (Animal)");
        System.out.print("Please Enter your choice: ");
        x = s.nextInt();

        switch (x) {
            case 1:
                Wolf obj1 = new Wolf();
                obj1.Noise();
                break;
            case 2:
                Lion obj2 = new Lion();
                obj2.Noise();
                break;
            case 3:
                Cat obj3 = new Cat();
                obj3.Noise();
                break;
            case 4:
                Wolf obj4 = new Wolf();
                obj4.sleep();
                obj4.Noise();
                obj4.roam();
                break;
            default:
                System.out.println("Invalid choice");
        }
        s.close();
    }
}