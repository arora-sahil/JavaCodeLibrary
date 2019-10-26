package com.java.arrays;

import com.java.inputs.InputUtility;

import java.util.Scanner;

public class BinarySearch implements InputUtility {

     protected BinarySearch()
     {

     }
     public BinarySearch(int a,int b)
    {
      this();
    }
    public static void main(String[] args) throws Exception {

        BinarySearch binarySearch = new BinarySearch();
        int arr[]=binarySearch.takeIntegerInput();

        int element = 8;
        int begin = 0;

        int l = (arr.length -1);
        int mid = 0;
        mid = calculateMid(begin, l);

        for(int i=0;i <= l/2;i++)
        {
            if(arr[mid]==element)
            {
                System.out.println("Location:"+mid);
            }

            if(element > arr[mid])
            {
                mid =calculateMid(mid + 1, l);
            }
            else
            {
                mid =calculateMid(0,mid - 1);
            }
        }

    }

    private static int calculateMid(int begin, int end) {
        int mid = (end % 2 == 0) ? (begin + end) / 2 : (begin + end +  1) / 2;

        return mid;
    }
}
