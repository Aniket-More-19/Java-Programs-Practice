package com.javaPlacementPreaparation;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int factorial = num;

        int i = 1;
        while(i < num){
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial is : "+factorial);
    }
}
