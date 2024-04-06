package com.javaPlacementPreaparation;

import java.util.Scanner;

public class ASCIIvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0); // cahracter input can be anything, not just alphabets !

        // casting char value to int to get ASCII value
        int asciival = (int) ch;
        System.out.println("ASCII value of " + ch + " is : " + asciival);
    }
}
