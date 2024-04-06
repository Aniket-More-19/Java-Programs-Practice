package com.javaPlacementPreaparation;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            sum += Math.pow(rem, 3);
            num /= 10;
        }
        if(original == sum){
            System.out.println(original+" is Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
