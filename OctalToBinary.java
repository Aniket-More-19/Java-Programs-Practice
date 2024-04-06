package com.javaPlacementPreaparation;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal number : ");
        String octalValue = sc.next();

        // decimal value representing octal value
        int octal = Integer.parseInt(octalValue,8);
        // binary string of decimal value in 'octal'
        String binary = Integer.toBinaryString(octal);

        System.out.print("Binary number : "+binary);
    }
}
