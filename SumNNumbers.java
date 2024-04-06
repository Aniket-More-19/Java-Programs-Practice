package com.javaPlacementPreaparation;

import java.util.Scanner;

public class SumNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number N : ");
        int N = sc.nextInt();

        // without formula for sum of N numbers

        int sum = 0;
        while(N > 0){
            sum = sum + N;
            N--;
        }
        System.out.println("Sum is : "+sum);
    }
}
