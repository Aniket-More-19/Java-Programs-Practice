package com.javaPlacementPreaparation;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N number of people : ");
        int n = sc.nextInt();
        System.out.print("Enter R number of seats : ");
        int r = sc.nextInt();
        permutation(n,r);
    }
    static void permutation(int n, int r){
        int perm = 1;
        for (int i = n; i > (n-r) ; i--) {
            perm *= i;
        }
        System.out.println("Permutation : "+ perm);
    }
}
