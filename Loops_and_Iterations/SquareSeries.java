package com.demoproject.helloworld;
import java.util.*;

public class SquareSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i * i);
        }
        s.close();
    }
}