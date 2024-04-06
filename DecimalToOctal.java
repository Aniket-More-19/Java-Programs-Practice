package com.javaPlacementPreaparation;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int decimal = sc.nextInt();

        int octal = 0, base = 1;
        while(decimal > 0){
            int rem = decimal % 8;
            octal = octal + rem * base;
            decimal = decimal / 8;
            base = base * 10;
        }
        System.out.println(octal);

    }
}
