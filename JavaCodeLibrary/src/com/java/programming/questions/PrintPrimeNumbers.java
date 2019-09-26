package com.java.programming.questions;

import com.java.inputs.InputUtility;

import java.util.*;

public class PrintPrimeNumbers implements InputUtility {
    public static void main(String args[])
    {
        Set<Integer> set = new TreeSet<Integer>();

        set.add(2);
        int count = 0;
        int n = new PrintPrimeNumbers().takeInput();

           for(int i=3;i<n;i++)
           {
               for(int a : set)
               {
                   count +=1;
                   if(i%a == 0)
                   {
                       count =0;
                       break;
                   }
                  else if(i%a !=0 && set.size() == count)
                  {
                     set.add(i);
                     count=0;
                  }
              }
        }



           System.out.println(set);
    }
}
