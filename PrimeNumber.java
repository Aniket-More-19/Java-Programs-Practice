package com.javaPlacementPreaparation;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int count = 0;

        if(num > 1) {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    count ++;
                }
            }
        }
        if(count > 0){
            System.out.println(num +" is not prime");
        }
        else{
            System.out.println(num +" is prime");
        }
    }
}
