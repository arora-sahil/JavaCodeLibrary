package com.java.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupSumQ {
	public static void main(String[] args) {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int totalElements = 0;
	int start = 0;
	int target = 0;
	int numArr[] = {};

	try {
		start = Integer.parseInt(br.readLine());
		target = Integer.parseInt(br.readLine());
		totalElements = Integer.parseInt(br.readLine());
		numArr = new int[totalElements];
		String num[] = br.readLine().split(" ");
		for(int i=0; i<totalElements; i++)
		{
			numArr[i] = Integer.parseInt(num[i]);
		}
		
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}	
	
	
	boolean isGrpSum = groupSum(start, numArr , target );
	String value = isGrpSum ==true ? "YES":"No";
	System.out.println("isGrpSum"+ value);
	
}

	private static boolean groupSum(int start, int[] nums, int target) {
		  if (start >= nums.length) return (target == 0);
		  
		  System.out.println("start"+(start+1)+"target"+(target - nums[start]));

	 	  if (groupSum(start + 1, nums, target - nums[start])) 
	 		  return true;
	      System.out.println("start"+(start + 1)+"target"+target);		


		  if (groupSum(start + 1, nums, target)) 
			  return true;
		  
		  
		  return false;	}
}
