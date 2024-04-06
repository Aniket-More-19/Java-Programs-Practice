package com.javaPlacementPreaparation;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary number : ");
        int binary = sc.nextInt();
        // binary to decimal
        int decimal = 0, i =0;
        while(binary > 0){
            int rem = binary % 10;
            decimal = (int) (decimal + (rem * Math.pow(2,i)));
            i++;
            binary = binary / 10;
        }
        System.out.println("decimal number : "+decimal);
        // decimal to octal
        String octalString = Integer.toOctalString(decimal);
        int octalNumber = Integer.parseInt(octalString);

        System.out.println("octal number : "+octalNumber);
    }
}