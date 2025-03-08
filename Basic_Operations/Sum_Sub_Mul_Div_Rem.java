import java.util.*;

public class Sum_Sub_Mul_Div_Rem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();

        System.out.println("Sum: " + (a + b));
        System.out.println("Product: " + (a * b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        sc.close();
    }
}