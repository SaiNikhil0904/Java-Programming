package com.demoproject.helloworld;

public class PrintHexAlphabet {
    public static void main(String args[]) {
        for (int i = 65; i <= 90; i++) {
            System.out.print(Integer.toHexString(i) + " ");
        }
        System.out.println();
        
        for (int i = 97; i <= 122; i++) {
            System.out.print(Integer.toHexString(i) + " ");
        }
    }
}