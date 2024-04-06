package com.javaPlacementPreaparation;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int temp_num = num;
        int sum = 0;

        // sum of digits in number
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        if(temp_num % sum == 0){
            System.out.println(temp_num+" is Harshad number");
        }
        else{
            System.out.println(temp_num+" is not Harshad number");
        }
    }
}
