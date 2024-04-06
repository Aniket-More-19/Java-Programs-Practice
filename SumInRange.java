package com.javaPlacementPreaparation;
import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start range : ");
        int start = sc.nextInt();
        System.out.println("Enter end range : ");
        int end = sc.nextInt();

        int sum = 0;

        while (start <= end){
            sum = sum + start;
            start ++;
        }
        System.out.println("Addition in given range is  : "+sum);
    }
}
