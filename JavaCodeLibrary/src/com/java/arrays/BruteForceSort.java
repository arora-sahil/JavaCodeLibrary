package com.java.arrays;

import com.java.inputs.InputUtility;

class BruteForceSort implements InputUtility {

    public static void main(String[] args) {

        BruteForceSort b = new BruteForceSort();
        int arr[] =b.takeIntegerInput();
        for(int a : arr) {
            System.out.print(" "+a);
        }
    }
}
