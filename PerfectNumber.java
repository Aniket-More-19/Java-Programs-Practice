package com.javaPlacementPreaparation;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(num == (perfectNumber(num))){
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is not perfect number");
        }
    }
    static int perfectNumber(int num){
        int sum = 0;
        int i = 1;
        while(i <= num/2){
            if(num % i == 0){
                sum = sum + i;
            }
            i++;
        }
        return sum;
    }
}
