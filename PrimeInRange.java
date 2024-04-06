package com.javaPlacementPreaparation;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start range : ");
        int start = sc.nextInt();
        System.out.print("Enter end range : ");
        int end = sc.nextInt();

        int count = 0;

        if(start == 1){
            start ++;
        }
        if(start < 1){
            start ++;
        }
        else{
            for (int num = start; num <= end; num++) {
                count = 0;
                // prime number logic
                for (int i = 2; i <=  Math.sqrt(num); i++) {
                    if(num % i == 0){
                        count ++;
                    }
                }
                if(count == 0){
                    System.out.println("Prime number : "+num);
                }
            }

        }
    }
}
