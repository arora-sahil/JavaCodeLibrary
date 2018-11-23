package com.java.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InsertingStringElements {
	
	public static void main(String args[])
	{
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		//Given a String
		Scanner sc = new Scanner(System.in);
		String str = sc.next();		
		//Insert elements
        map = addElementsToMap(str);		       
        System.out.println(map);
        sc.close();
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
