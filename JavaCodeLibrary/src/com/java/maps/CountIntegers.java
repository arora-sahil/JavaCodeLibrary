package com.java.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountIntegers {
	
	public static void main(String args[])
	{
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

		//Given a String
		Scanner sc = new Scanner(System.in);
		String str = sc.next();		
		//Insert elements
        map = addElementsToMap(str);	
        countMap = countIntegers(map);
        System.out.println(map);
        System.out.println(countMap);

        sc.close();
	}
	// This function counts the number of integers
	private static Map<Integer, Integer> countIntegers(Map<Character, Integer> hMap) {
		Map<Integer, Integer> cMap = new HashMap<Integer, Integer>();
		
		for(int element : hMap.values())
		{
			if(cMap.containsKey(element))
		    {
				cMap.put(element, cMap.get(element) + 1);
		    }
		    else
		    {
		    	cMap.put(element, 1);
		    }
			
		}
		
		return cMap;
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
