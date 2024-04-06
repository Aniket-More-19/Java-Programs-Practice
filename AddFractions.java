package com.javaPlacementPreaparation;

import java.util.Scanner;

public class AddFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 nuemrator : ");
        int n1 = sc.nextInt();
        System.out.print("Enter d1 nuemrator : ");
        int d1 = sc.nextInt();
        System.out.print("Enter n2 nuemrator : ");
        int n2 = sc.nextInt();
        System.out.print("Enter d2 nuemrator : ");
        int d2 = sc.nextInt();

        System.out.println(n1 + "/" + d1 +" + "+ n2 + "/" + d2 + " = ");
        // denominator same logic
        int commonDenominator = d1 * d2;
        int nuem1 = n1 * d2;
        int nuem2 = n2 * d1;
        int sumNuemrator = nuem1 + nuem2;

        System.out.println(sumNuemrator + "/" + commonDenominator);
    }
}
