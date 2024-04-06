package com.javaPlacementPreaparation;

import java.util.Scanner;

public class SumNNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number N : ");
        int N = sc.nextInt();

        int sum = N*(N+1)/2;
        System.out.println("Sum is : "+sum);
    }
}
