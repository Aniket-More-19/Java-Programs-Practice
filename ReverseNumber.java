package com.javaPlacementPreaparation;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int ans = 0;

        while(num > 0){
            int rem = num % 10;
            ans = ans * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse number is : "+ans);
    }
}
