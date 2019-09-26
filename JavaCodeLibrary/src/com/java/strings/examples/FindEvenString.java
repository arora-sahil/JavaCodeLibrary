package com.java.strings.examples;

import com.java.inputs.InputUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindEvenString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sf = new StringBuffer();
        String str = sc.nextLine();
        ArrayList evenIndexes = new ArrayList();
        ArrayList oddIndexes = new ArrayList();

        for(int i =0; i< str.length();i++)
        {
            if(i % 2 ==0)
            {
                evenIndexes.add(str.charAt(i));
            }
            else
            {
                oddIndexes.add(str.charAt(i));
            }
        }

        System.out.println("Even Indexes"+Arrays.asList(evenIndexes));
        System.out.println("Odd Indexes"+Arrays.asList(oddIndexes));
    }
}
