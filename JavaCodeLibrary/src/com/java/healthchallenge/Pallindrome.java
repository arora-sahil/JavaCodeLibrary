package com.java.healthchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Pallindrome {
	
	private static boolean callPallindromeFunc(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		boolean isValid = false;
		int count =0;
		int sizeChk = 0;
		//Insert elements
        map = addElementsToMap(str);	
        for(int value : map.values())
        {
        	if(value ==1 || value % 2 != 0)
        	{
        		count++;
        	}
        	if(value % 2 == 0 || count == 1)
        	{
        		sizeChk++;
        	}    		
        }
        if(sizeChk == map.keySet().size())
        {
        	isValid = true;
        }
		return isValid;
	}
	 public static void main(String args[] ) throws Exception {
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int totalElements;
			try {
				totalElements = Integer.parseInt(br.readLine());
				for(int i=0; i<totalElements; i++)
				{
			     String strArr = br.readLine();
				 boolean isValid = callPallindromeFunc(strArr);
				 System.out.println(isValid ? "YES":"NO");

				}
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}

	    }

	private static Map<Character, Integer> addElementsToMap(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char chr : str.toCharArray())
		{
		    if(map.containsKey(chr))
		    {
		    	map.put(chr, map.get(chr) + 1);
		    }
		    else
		    {
		    	map.put(chr, 1);
		    }
		}
		
		return map;
	}

}
