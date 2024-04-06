package com.javaPlacementPreaparation;

import java.util.Scanner;

public class AbudantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;

        // sum of divisors
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if(sum > num){
            System.out.println(num + " is Abudant number");
        }else{
            System.out.println(num + " is not Abudant number");
        }
    }
}
