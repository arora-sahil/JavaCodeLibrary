package com.java.arrays;

import com.java.inputs.InputUtility;

import java.util.function.IntPredicate;

public class MergeSortedArrays implements InputUtility {
    public static void main(String[] args) {
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
        int arr[] = mergeSortedArrays.takeIntegerInput();
        int brr[] = mergeSortedArrays.takeIntegerInput();
        int n = arr.length + brr.length ;
        System.out.println("Array size: "+n);
        int[] mergedArray = new int[n];


        int i=0, j=0, k=0;

        while (i < arr.length && j < brr.length)
        {
            if (arr[i] < arr[j])
            {
                mergedArray[k] = arr[i];
                i++;
                k++;
            }
            else
            {
                mergedArray[k] = brr[j];
                j++;
                k++;
            }
        }

        while (i < arr.length)
        {
            mergedArray[k] = arr[i];
            i++;
            k++;
        }

        while (j < brr.length)
        {
            mergedArray[k] = brr[j];
            j++;
            k++;
        }
        System.out.println(mergedArray);
    }

}
