package com.javaPlacementPreaparation;

import java.util.Scanner;

public class NoOfDigitsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer number : ");
        int num = sc.nextInt();
        int count = 0;

        while (num > 0){
            count++;
            num /= 10;
        }
        System.out.println("Number of digits in integer : "+count);
    }
}
