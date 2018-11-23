package com.java.inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 Sample Input:
 2
 sahil arora

 Sample Output:
 Name:sahil
 Name:arora
  */

public class MultipleStringBufferedReader {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalElements;
		try {
			totalElements = Integer.parseInt(br.readLine());
			String strArr[] = br.readLine().split(" ");
			for(int i=0; i<totalElements; i++)
			{
				System.out.println("Name:"+strArr[i]);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}		
	}

}
