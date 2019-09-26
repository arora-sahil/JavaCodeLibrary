package com.java.arrays;

public interface ArraysUtility {

    default int[] bruteForceSort(int arr[], int n)
    {
        int temp =0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
