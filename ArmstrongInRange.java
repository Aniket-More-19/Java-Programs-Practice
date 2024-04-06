package com.javaPlacementPreaparation;

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start range : ");
        int start = sc.nextInt();
        System.out.print("Enter end range : ");
        int end = sc.nextInt();

        for(int num = start; num <= end; num++){
            int original = num;
            int sum = 0;
            int tempNum = num;

            while(tempNum > 0){
                int rem = tempNum % 10;
                sum += Math.pow(rem,3);
                tempNum /= 10;
            }
            if(original == sum) {
                System.out.println("Armstrong number : " + original);
            }
        }
    }
}
