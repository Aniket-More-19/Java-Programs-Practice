package com.javaPlacementPreaparation;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int original_num = num;
        int square = num * num;

        // digits in number
        int count_digits = 0;
        while(num > 0){
            int rem = num % 10;
            count_digits++;
            num = num / 10;
        }

        // comparing number with last digits of square
        int last_digits = 0;
        int rem = (int) (square % (Math.pow(10, count_digits)));
        last_digits = rem;

        if(original_num == last_digits){
            System.out.println(original_num+" is automorphic number");
        }
        else{
            System.out.println(original_num+" is not automorphic number");

        }
    }
}
