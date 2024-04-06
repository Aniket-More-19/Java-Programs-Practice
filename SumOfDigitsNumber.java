package com.javaPlacementPreaparation;

import java.util.Scanner;

public class SumOfDigitsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int ans = 0;

        while(num > 0){
            int rem = num % 10;
            ans = ans + rem;
            num = num / 10;
        }
//        for(int i = 0; num > 0; i++){
//            int rem = num % 10;
//            ans = ans + rem;
//            num = num / 10;
//        }

        System.out.println("Sum is : "+ans);
    }
}
