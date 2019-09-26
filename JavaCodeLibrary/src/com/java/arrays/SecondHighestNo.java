package com.java.arrays;

import com.java.inputs.InputUtility;

public class SecondHighestNo implements InputUtility,ArraysUtility {

    public static void main(String[] args) {

        SecondHighestNo secondHighestNo = new SecondHighestNo();

        //firstApproach(secondHighestNo);
        secondApproach(secondHighestNo);

    }

    private static void secondApproach(SecondHighestNo secondHighestNo) {

        int arr[] =secondHighestNo.takeIntegerInput();
        int l = arr.length;
        int largest =arr [0];
        int secondLargest = arr[0];

        for(int i=1; i<l; i++)
        {
            if(largest < arr[i])
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(secondLargest < arr[i])
            {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }

    private static void firstApproach(SecondHighestNo secondHighestNo) {

        int arr[] =secondHighestNo.takeIntegerInput();
        int l = arr.length;
        int sortedArr[] = secondHighestNo.bruteForceSort(arr,l);
        
        System.out.println(arr[l-2]);
    }
}
