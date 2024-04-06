package com.javaPlacementPreaparation;

import java.util.Scanner;

public class PrimeIn1to100 {
    public static void main(String[] args) {
        System.out.println("Prime Numbers between 1 to 100 : ");

        for(int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            // checking each val till 100
            for (int j = 2; j <= i/2 ; j++) {
                if(i % j == 0){
                  isPrime = false;
                  break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
