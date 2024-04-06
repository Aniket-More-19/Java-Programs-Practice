package com.javaPlacementPreaparation;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter m : ");
        int m = sc.nextInt();

        int min = n;
        if(min > m){
            min = m;
        }

        int HCF = 1;
        for(int i = 1; i <= min; i++){
            if(n % i == 0 && m % i == 0){
                HCF = i;
            }
        }
        System.out.println(HCF + " is HCF");
    }
}
