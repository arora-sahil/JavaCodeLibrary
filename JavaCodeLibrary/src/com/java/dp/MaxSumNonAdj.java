package com.java.dp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxSumNonAdj {
    static int sum1=0,sum2=0,max1=0,max2=0;

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        for(int n=0;n < arr.length ;n++)
        {
        if(n % 2 == 0)
        {
            sum1 += arr[n];
            max1 = Math.max(max1,sum1);
            max1 = Math.max(arr[n],sum1);
            System.out.println("max1:"+max1);
        }
        else
        {
           sum2 += arr[n];
           max1 = Math.max(max2,sum2);
           max2 = Math.max(arr[n],sum2);
           System.out.println("max2:"+max2);
        }
        }
        return Math.max(max1,max2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = maxSubsetSum(arr);
        System.out.println(res);

//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
