package com.javaPlacementPreaparation;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);

        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
            System.out.println(ch + " is an alphabet");

            switch (ch) {
                case 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S',
                        'T', 'V', 'W', 'X', 'Y', 'Z', 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k',
                        'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w',
                        'x', 'y', 'z' -> System.out.println(ch + " is a consonant");

                case 'A','E','I','O','U','a','e','i','o','u' -> System.out.println(ch +" is a vowel");
                default -> System.out.println(ch + " is not a consonant");
            }

        }else {
            System.out.println(ch + " is not alphabet. Wrong input !");
        }
    }
}
