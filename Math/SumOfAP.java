import java.util.*;

public class SumOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Element N1: ");
        int a = sc.nextInt();
        System.out.print("Enter Total number of Elements N2: ");
        int n = sc.nextInt();
        System.out.print("Enter the Common Difference N3: ");
        int d = sc.nextInt();

        int sum = n * (2 * a + (n - 1) * d) / 2;
        System.out.println("Sum of AP: " + sum);
        sc.close();
    }
}