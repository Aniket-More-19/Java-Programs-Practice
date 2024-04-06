package com.javaPlacementPreaparation;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float radius = sc.nextFloat();

        double area = 3.14149 * radius * radius;

        System.out.println("Area of circle : "+ area);
    }
}
