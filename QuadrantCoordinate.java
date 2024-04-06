package com.javaPlacementPreaparation;

import java.util.Scanner;

public class QuadrantCoordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X co-ordinate : ");
        int x = sc.nextInt();
        System.out.print("Enter Y co-ordinate : ");
        int y = sc.nextInt();

        // finding quadrant
        findQuadrant(x, y);

    }
    static void findQuadrant(int x, int y){
        if(x == 0 && y == 0){
            System.out.println(x + " "+ y + " Co- ordinates at origin");
        }else if(x > 0 && y > 0){
            System.out.println(x + " "+ y + " Co- ordinates in 1st quadrant");
        } else if(x < 0 && y > 0){
            System.out.println(x + " "+ y + " Co- ordinates in 2nd quadrant");
        } else if(x < 0 && y < 0){
            System.out.println(x + " "+ y + " Co- ordinates in 3rd quadrant");
        } else if(x > 0 && y < 0){
            System.out.println(x + " "+ y + " Co- ordinates in 4th quadrant");
        } else if(x == 0 && y > 0){
            System.out.println(x + " "+ y + " Co- ordinates in +ve Y axis");
        } else if(x == 0 && y < 0){
            System.out.println(x + " "+ y + " Co- ordinates in -ve Y axis");
        }  else if(x > 0 && y == 0){
            System.out.println(x + " "+ y + " Co- ordinates in +ve X axis");
        }  else if(x < 0 && y == 0){
            System.out.println(x + " "+ y + " Co- ordinates in -ve X axis");
        } else {
            System.out.println("Co-ordinates not found !");
        }
    }
}