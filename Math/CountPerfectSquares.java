import java.util.*;

public class CountPerfectSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        int count = 0;

        for (int i = 0; i * i <= n2; i++) {
            if (i * i >= n1 && i * i <= n2) {
                count++;
            }
        }
        System.out.println("Count: " + count);
        sc.close();
    }
}