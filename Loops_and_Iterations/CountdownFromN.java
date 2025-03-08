import java.util.*;

public class CountdownFromN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any natural number: ");
        int n = sc.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}