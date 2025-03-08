import java.util.*;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Element: ");
        int a = sc.nextInt();
        System.out.println("Factors of " + a + " are: ");

        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                System.out.print(i + " ");
        }
        sc.close();
    }
}