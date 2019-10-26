package com.java.arrays;

import com.java.inputs.InputUtility;

public class RemoveDuplicatesFromArray implements InputUtility {

    public static void main(String args[])
    {
        int arr[] = new RemoveDuplicatesFromArray().takeIntegerInput(); //1 2 1 4 7 6

        int newArr[] = new int[arr.length];
        approach1(arr, newArr);
    }

    private static void approach1(int[] arr, int[] newArr) {


    }
}
