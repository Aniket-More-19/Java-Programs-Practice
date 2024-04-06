package com.javaPlacementPreaparation;

import java.util.Scanner;

public class Sum2Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean isPrime = false;

        for (int i = 2; i <= num/2; i++) {
            if(isPrime(i)){
                // check for num - i is prime
                if (isPrime(num - i)){
                    isPrime = true;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " is sum of 2 prime numbers.");
        }else{
            System.out.println(num + " is not sum of 2 prime numbers.");
        }
    }
    static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        if(num % 2 == 0){
            return false;
        }
        return true;
    }
}
