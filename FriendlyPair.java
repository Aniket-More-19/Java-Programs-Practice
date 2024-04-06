package com.javaPlacementPreaparation;

import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter m : ");
        int m = sc.nextInt();

        // finding ratio of (sum of divisors/ number)
        double ratio_of_n = findRatio(n);
        double ratio_of_m = findRatio(m);

        if(ratio_of_n == ratio_of_m){
            System.out.println(n+" and "+ m +" is a friendly pair");
        }else{
            System.out.println(n+" and "+ m +" is not friendly pair");

        }
}
    static double findRatio(int num) {
        int sum = 0;
        for(int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        double ratio = (((double)sum) / num);
        return ratio;
    }
}
