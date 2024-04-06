package com.javaPlacementPreaparation;

import java.util.Scanner;

public class PowerofNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        System.out.print("Enter it's power : ");
        int pow = in.nextInt();

        int temp = num;

        while(pow > 1){
            num = temp * num;
            pow--;
        }
        System.out.println("Number is : "+num);
    }
}
