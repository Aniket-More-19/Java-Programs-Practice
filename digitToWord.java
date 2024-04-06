package com.javaPlacementPreaparation;

import java.util.Scanner;

public class digitToWord {
    private static final String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] twoDigits = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] powers = {"Hundred", "Thousand"};

    public static void main(String[] args) {
        int digit = 1234;
        System.out.println("Enter integer digit : "+ digit);
        digitToWord(digit);
    }
    public static void digitToWord(int num){
        if(num < 10){
            System.out.println(units[num]);
        }else if(num < 20){
            System.out.println(twoDigits[num - 10]);
        }else if(num < 100){
            System.out.println(tens[num / 10] + ((num % 10 != 0) ? " ":" ")+ units[num % 10]);
        }else if(num < 1000){
            System.out.println(units[num / 100] + " "+ powers[0] + ((num % 100 != 0) ? " and" : " "));
            digitToWord(num % 100);
        }else{
            System.out.println(units[num / 1000] + " "+ powers[1] + " ");
            digitToWord(num % 1000);
        }
    }
}
