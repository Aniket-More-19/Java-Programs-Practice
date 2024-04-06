package com.javaPlacementPreaparation;

import java.util.Scanner;

public class AbphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);

        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
            System.out.println(ch + " is an alphabet");
        }else {
            System.out.println(ch + " is not alphabet");
        }
    }
}
