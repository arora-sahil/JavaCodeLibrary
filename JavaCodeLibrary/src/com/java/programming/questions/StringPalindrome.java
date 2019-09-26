package com.java.programming.questions;

import com.java.inputs.InputUtility;

public class StringPalindrome implements InputUtility {
    public static void main(String args[])
    {
        String str = new StringPalindrome().takeStringInput();
        char c[] = str.toCharArray();
        int j = str.length() -1;
        int count=0;

        for(int i=0; i<= Math.ceil(j/2) ;i++)
        {
            if(!(c[i] == c[j]))
            {
                break;
            }
            else if(c[i] == c[j])
            {
                count +=1;
            }
            j--;
        }
        if(count == Math.ceil(j))
        {
            System.out.println(str+" is a pallindrome");
        }
        else
        {
            System.out.println(str+" is not a pallindrome");
        }
    }
}
