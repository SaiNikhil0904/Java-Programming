import java.util.*;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int c = sc.nextInt();

        int sum = a + b + c;
        int avg = sum / 3;

        System.out.println("The Average of three numbers is: " + avg);

        sc.close();
    }
}