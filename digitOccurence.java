package com.javaPlacementPreaparation;

import java.util.Scanner;

public class digitOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int digit = sc.nextInt();
        System.out.print("Enter the number : ");
        int org_num = sc.nextInt();
        int num = org_num;
        int count = 0;

        while(num != 0){
            int rem = num % 10;
            if(rem == digit){
                count++;
            }
            num /= 10;
        }
        System.out.println(digit+ " occurs "+count+" times in "+org_num);
    }
}
