package com.javaPlacementPreaparation;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while(num > 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        if (original == reverse){
            System.out.println(original+ " is palindrome number ");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
