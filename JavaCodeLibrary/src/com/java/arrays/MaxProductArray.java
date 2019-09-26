package com.java.arrays;

import com.java.inputs.InputUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxProductArray implements InputUtility {
    public static void main(String[] args) {
        MaxProductArray obj = new MaxProductArray();
        int product = 1;
        int count = 0;
        int temp =0;
       int arr[]= obj.takeIntegerInput();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i] > 0)
            {
                product *= arr[i];
            }
            else if(arr[i] < 0)
            {
                count = count + 1;
                list.add(arr[i]);
            }
        }

        Collections.sort(list);

        for(int i =0; i<list.size();i++)
        {
            if(count%2 ==0)
            {
                product *= list.get(i);
            }
            else if(!(count%2 ==0) && i!= list.size() -1)
            {
                product *= list.get(i);
            }

        }
        System.out.println("Product: "+product);
    }
}
