import java.util.*;

public class DigitToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int r = 0, R, s, p;

        while (n != 0) {
            s = n % 10;
            while (s != 0) {
                p = s % 2;
                s = s / 2;
                r = r * 10 + p;
            }
            n = n / 10;
        }

        while (r != 0) {
            R = r % 10;
            System.out.print(R);
            r = r / 10;
        }
        sc.close();
    }
}