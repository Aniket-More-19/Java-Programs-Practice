package com.javaPlacementPreaparation;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Oops! You entered zero");
        }

        if(num < 0 && num != 0){
            System.out.println(num + " is negative");
        }
        else{
            if(num !=0){
                System.out.println(num +" is positive");
            }
        }
    }
}
