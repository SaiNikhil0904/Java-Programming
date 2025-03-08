package com.demoproject.helloworld;

public class CountBinaryNumbers {
    static int countNum(int n) {
        int count = 0, i = 1;
        while (true) {
            if (n >= ((1 << i) - 1))
                count++;
            else
                break;
            i++;
        }
        return count;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(countNum(n));
    }
}