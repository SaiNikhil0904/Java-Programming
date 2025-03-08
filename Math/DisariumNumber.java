package com.demoproject.helloworld;
import java.util.*;

public class DisariumNumber {
    public static int calculateLength(int n) {
        int length = 0;
        while (n != 0) {
            length++;
            n /= 10;
        }
        return length;
    }

    public static void main(String[] args) {
        int num = 135, sum = 0, rem, n;
        int len = calculateLength(num);
        n = num;
        
        while (num > 0) {
            rem = num % 10;
            sum += (int) Math.pow(rem, len);
            num /= 10;
            len--;
        }

        if (sum == n) {
            System.out.println(n + " is a Disarium number");
        } else {
            System.out.println(n + " is not a Disarium number");
        }
    }
}