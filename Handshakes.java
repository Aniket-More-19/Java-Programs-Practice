package com.javaPlacementPreaparation;

import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N numebr of handshakes : ");
        int n = sc.nextInt();

        // 2 hands each person
        // total n people
        // calculate for except you
        // i.e.  n * (n-1) / 2

        int handshakes = (n * (n-1)) / 2;
        System.out.println("Handshakes : "+handshakes);
    }
}
