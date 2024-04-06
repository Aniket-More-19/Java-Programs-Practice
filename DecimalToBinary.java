package com.javaPlacementPreaparation;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int decimal = sc.nextInt();


        int binary = 0, base = 1;
        while(decimal > 0){
            int rem = decimal % 2;
            binary = binary  + rem * base;
            decimal = decimal / 2;
            base = base * 10;
        }
        System.out.println(binary);
    }
}
