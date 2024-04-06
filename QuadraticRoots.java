package com.javaPlacementPreaparation;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print("Enter c : ");
        int c = sc.nextInt();

        double determinant = b * b - 4 * a * c;
        if(determinant > 0){
            // two real & distinct roots
            double root1 = (-b + Math.sqrt(determinant) / (2*a));
            double root2 = (-b - Math.sqrt(determinant) / (2*a));
            System.out.format("root1 = %.2f and root2 = %.2f ", root1, root2);
        }
        else if(determinant == 0){
            // two real & equal roots
            double root1 , root2;
            root1 = root2 = (-b / (2*a));
            System.out.format("root1 = root2 = %.2f ", root1);
        }
        else{
            double real = -b / (2*a);
            double imaginary = Math.sqrt(-determinant) / (2*a);
            System.out.printf("root1 = %.2f + %.2fi %n", real, imaginary);
            System.out.printf("root2 = %.2f - %.2fi ", real, imaginary);

        }
    }
}
