import java.util.*;

class SumConstructorOverload {
    SumConstructorOverload(int N1, int N2) {
        int sum1 = N1 + N2;
        System.out.println("Sum of N1 & N2 is: " + sum1);
    }

    SumConstructorOverload(int N1, int N2, int N3) {
        int sum2 = N1 + N2 + N3;
        System.out.println("Sum of N1, N2 & N3 is: " + sum2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int N1 = sc.nextInt();
        System.out.print("Enter Number2: ");
        int N2 = sc.nextInt();
        System.out.print("Enter Number3: ");
        int N3 = sc.nextInt();

        SumConstructorOverload m1 = new SumConstructorOverload(N1, N2);
        SumConstructorOverload m2 = new SumConstructorOverload(N1, N2, N3);
        sc.close();
    }
}