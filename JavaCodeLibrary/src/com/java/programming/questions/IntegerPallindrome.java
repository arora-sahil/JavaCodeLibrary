package com.java.programming.questions;

import com.java.inputs.InputUtility;

public class IntegerPallindrome implements InputUtility {
    public static void main(String args[])
    {
        int num = new IntegerPallindrome().takeInput();
        int originalNum = num;
        int reverse = 0;

        while(num != 0)
        {
            int remainder = num % 10 ;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        if(reverse == originalNum)
        {
            System.out.println(originalNum+" is a  pallindrome");
        }
        else
        {
            System.out.println(originalNum+" is not a  pallindrome");
        }
    }
}
