package com.java.programming.questions;

import com.java.inputs.InputUtility;

public class ArmstrongNumber implements InputUtility {
    public static void main(String args[])
    {
        int num = new ArmstrongNumber().takeInput();
        int originalNum = num;
        int sum =0;

        while(num != 0)
        {
            int rem = num % 10;
            sum += Math.pow(rem, 3);
            num = num / 10;
        }
        if(originalNum == sum) {
            System.out.println(originalNum+" is a Armstrong number");
        }
        else
        {
            System.out.println(originalNum+" is not a Armstrong number");
        }
    }
}
