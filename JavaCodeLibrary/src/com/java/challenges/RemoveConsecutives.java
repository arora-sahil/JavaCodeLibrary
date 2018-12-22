package com.java.challenges;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class RemoveConsecutives {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        // Write an action using System.out.println()
        System.err.println("Debug messages...");
        String finalStr = removeConsecutives(str);
        System.out.println(finalStr);
    }
    private static String removeConsecutives(String str)
    {   
    	HashSet<Character> set  = new HashSet<>();
        StringBuilder strBuilder = new StringBuilder(str);

        for(int i=0; i<str.length() -1 ;i++)
        {
            if((str.charAt(i+ 1) - str.charAt(i)) == 1)
            {
             set.add(str.charAt(i+1));
             set.add(str.charAt(i));
            }
        }
        if(set.isEmpty())
        {
        	return strBuilder.toString();
        }
        else 
        {
          for(char j : set)
          {
          strBuilder = deleteCharacter(strBuilder.toString(),j);
          }
        }
		return removeConsecutives(strBuilder.toString());
    }
	private static StringBuilder deleteCharacter(String str, char j) {
        StringBuilder strBuilder = new StringBuilder(str);
        
        strBuilder.deleteCharAt(str.indexOf(j));
        
        return strBuilder;
		
	}
}