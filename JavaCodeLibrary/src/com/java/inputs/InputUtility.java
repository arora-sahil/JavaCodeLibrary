package com.java.inputs;

import java.util.Scanner;

public interface InputUtility {
    Scanner sc = new Scanner(System.in);

    default int[] takeIntegerInput()
    {
        try {
            System.out.print("enter array size :  ");
            int n = sc.nextInt();
            System.out.print("arr elements: ");
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            return arr;
        }
        finally {
            sc.close();
        }
    }
    default <T> T[] takeGenericInput()
    {

        System.out.print("enter array size :  ");
        int n=sc.nextInt();

        System.out.print("arr elements: ");
        Object arr[]= new Object[n];

        for(int i =0; i< n;i++)
        {
            arr[i] = (T) sc.next();
        }
        return (T[])arr;
    }
     default String takeStringInput(){
         System.out.print("Enter a String: ");

         String str = sc.nextLine();
        return str;
    }
    default int takeInput(){
      System.out.print("Enter a Integer: ");

        int n = sc.nextInt();
        return n;
    }
}
