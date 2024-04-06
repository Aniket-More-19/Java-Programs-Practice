package com.javaPlacementPreaparation.Arrays;

public class minArray {

    public static void main(String[] args) {
        int a[] = { 53, 12, 4, 234, 6, 32 };
        int min = a[0];
        // compare and iterate over each array element

        for (int i = 1; i < a.length; i++) {
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.println("Minimum in array : "+min);
    }
}
