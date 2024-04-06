package com.javaPlacementPreaparation;
import java.util.Scanner;

public class NumOfDaysYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month (in small case): ");
        String month = sc.nextLine();

        switch (month){
            case "january", "march", "may", "july", "august", "october", "december" -> System.out.println("31 days in "+month);
            case  "april", "june", "september", "november" -> System.out.println("30 days in "+month);
            case "februry" -> System.out.println("28 or 29 days in "+month);
            default -> System.out.println(month+ " not a valid month");
        }
    }
}
