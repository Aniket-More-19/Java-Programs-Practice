package com.javaPlacementPreaparation;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal number : ");
        String octalValue = sc.next();

        int decimal_val = Integer.parseInt(octalValue,8);
        System.out.println("Decimal number : "+decimal_val);
    }
}
