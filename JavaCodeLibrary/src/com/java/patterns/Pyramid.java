package com.java.patterns;

import com.java.inputs.InputUtility;

public class Pyramid implements InputUtility {

//         Print this pattern
//                *
//              * * *
//            * * * * *
//          * * * * * * *
    public static void main(String args[])
    {
        int n = new Pyramid().takeInput();
       approach1(n);
       // approach2(n);
    }

    private static void approach2(int n) {
        String s = "";
        for(int i=0;i<n; i++)
        {
            for(int j=n;j-1>i;j--)
            {
                System.out.print(" ");
            }

            System.out.println();
        }

        for(int k= 1;k< n;k++)
        {

            System.out.print(s);
        }
    }

    private static void approach1(int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=n;j-1>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
