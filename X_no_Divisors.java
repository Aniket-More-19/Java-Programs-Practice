package com.javaPlacementPreaparation;

import java.util.Scanner;

public class X_no_Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x number of divisors : ");
        int x = sc.nextInt();
        int count;

        for (int i = 1; i <= 100 ; i++) {
            count = 0;
            for (int j = 1; j <= i ; j++) {
                if(i % j == 0){
                    count++;
                }
            }
            if(count == x){
                System.out.print(i + " ");
            }
        }

    }
}
