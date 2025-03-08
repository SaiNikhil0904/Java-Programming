package com.demoproject.helloworld;
import java.util.*;

public class HCF_LCM {
    public static void main(String[] args) {
        int temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int numOne = a, numTwo = b;

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        int hcf = a;
        int lcm = (numOne * numTwo) / hcf;

        System.out.println("\nHCF(" + numOne + ", " + numTwo + ") = " + hcf);
        System.out.println("LCM(" + numOne + ", " + numTwo + ") = " + lcm);
        s.close();
    }
}