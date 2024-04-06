package com.javaPlacementPreaparation;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        long binary = sc.nextLong();

        int decimal = 0,i = 0;
        while(binary != 0){
            long rem = binary % 10;
            decimal = (int) (decimal + rem * Math.pow(2,i));
            binary /= 10;
            i++;
        }
        System.out.println("Decimal number is : "+decimal);
    }
}
