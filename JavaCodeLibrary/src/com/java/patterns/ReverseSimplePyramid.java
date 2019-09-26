package com.java.patterns;

import com.java.inputs.InputUtility;

public class ReverseSimplePyramid implements InputUtility {

//    Print this pattern
//    *****
//    ****
//    ***
//    **
//    *
    public static void main(String args[])
    {
        int n = new ReverseSimplePyramid().takeInput();

        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
