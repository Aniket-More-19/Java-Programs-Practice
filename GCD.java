package com.javaPlacementPreaparation;

import java.util.Scanner;

public class GCD {
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

        int GCD = 0;
        for(int i = 1; i <= min; i++){
            if((n % i == 0) && (m % i == 0)){
                GCD = i;
            }
        }
        System.out.println("GCD is : "+GCD);
    }
}
