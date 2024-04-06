package com.javaPlacementPreaparation;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number2 : ");
        int n2 = sc.nextInt();

        if(n1 > n2){
            System.out.println(n1+" is greater");
        }
        else{
            System.out.println(n2+" is greater");
        }
    }
}
