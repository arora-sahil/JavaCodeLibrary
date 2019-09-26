package com.java.arrays;

import com.java.inputs.InputUtility;

import java.util.Arrays;
import java.util.Map;

public class MergeUnsortedArrays implements InputUtility {

    public static void main(String[] args) {
        MergeUnsortedArrays mergeUnsortedArrays = new MergeUnsortedArrays();
        int arr[] = mergeUnsortedArrays.takeIntegerInput();
        int sortedArr [] = sortArrayFunc(arr);
        int brr[] = mergeUnsortedArrays.takeIntegerInput();
        int n = arr.length + brr.length ;
        System.out.println("Array size: "+n);


        int crr[] = new int[n];


        for(int i=0; i<arr.length; i++)
        {
            crr[i] = arr[i];
        }

        for(int i=0; i<brr.length; i++)
        {
                crr[n - 1] = brr[i];
                n =n -1 ;

        }
        Arrays.sort(crr);
        for(int c : crr) {
            System.out.print(" "+c);
        }
    }

    private static int[] sortArrayFunc(int[] arr) {

        for(int i=0;i<arr.length;i++)
        {

        }
        return arr;
    }

}
