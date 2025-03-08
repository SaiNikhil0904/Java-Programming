package com.demoproject.helloworld;
import java.util.*;

public class DudeneyNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int cubeRoot = (int) Math.round(Math.cbrt(n));
        if (cubeRoot * cubeRoot * cubeRoot == n) {
            int sum = 0, temp = n;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == cubeRoot) {
                System.out.println(n + " is a Dudeney number");
            } else {
                System.out.println(n + " is not a Dudeney number");
            }
        } else {
            System.out.println(n + " is not a Dudeney number");
        }
        in.close();
    }
}