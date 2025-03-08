package com.demoproject.helloworld;
import java.util.*;

public class PrintAlphabet {
    public static void printAlphabet(char ch) {
        if (Character.isLetter(ch)) {
            char c = (Character.isLowerCase(ch)) ? 'a' : 'A';
            while (c < ch) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        printAlphabet('d');
    }
}