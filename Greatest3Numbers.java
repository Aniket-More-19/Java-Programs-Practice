package com.javaPlacementPreaparation;

import java.util.Scanner;

public class Greatest3Numbers {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2st number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3st number : ");
        int n3 = sc.nextInt();

        way1(n1,n2,n3);

    }
    static void way1(int a, int b, int c){
        int max = 0;
        if(max < a){
            max = a;
        }
        if(max < b){
            max = b;
        }
        if (max < c){
            max = c;
        }
        System.out.println(max+ " is greatest");
    }
}
