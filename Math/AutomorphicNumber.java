import java.util.*;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int d = 0;
        int p = 1;
        
        while (temp != 0) {
            temp /= 10;
            d++;
        }
        int square = n * n;
        
        for (int i = 0; i < d; i++) {
            p *= 10;
        }
        
        if (square % p == n) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}