package com.javaPlacementPreaparation;

import java.util.Scanner;

public class ReplaceZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int original_num = num;

        int base = 1;
        do {
            int rem = num % 10;
            if(rem == 0){
                original_num = original_num + base;
            }
            base = base * 10;
            num = num / 10;
        }while (num > 0);
        System.out.println("After replacing 0s by 1s : " + original_num);
    }
}
