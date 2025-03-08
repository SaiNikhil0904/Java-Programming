import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp = n, temp1 = n, p = 0, s = 0, d = 0, a;

        while (temp1 != 0) {  // Count number of digits
            temp1 = temp1 / 10;
            d++;
        }

        while (n != 0) {  // Compute sum of digits raised to power d
            p = n % 10;
            a = p;
            for (int i = 1; i < d; i++) {
                p *= a;
            }
            s += p;
            n = n / 10;
        }

        if (temp == s) {
            System.out.println("1 (Armstrong Number)");
        } else {
            System.out.println("0 (Not an Armstrong Number)");
        }
        sc.close();
    }
}