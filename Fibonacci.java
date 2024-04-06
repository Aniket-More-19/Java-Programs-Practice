package com.javaPlacementPreaparation;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter nth number : ");
        int n = in.nextInt();

        int current = 0;
        int next = 1;
        int count = 2;

        for(int i = count; count <= n; count ++){
            int temp = next;
            next = current + next;
            current = temp;

            System.out.print(next +" ");
        }
    }
}
