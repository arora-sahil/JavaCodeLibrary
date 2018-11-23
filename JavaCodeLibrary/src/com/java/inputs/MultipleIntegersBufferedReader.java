package com.java.inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MultipleIntegersBufferedReader {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalElements;
		try {
			totalElements = Integer.parseInt(br.readLine());
			for(int i=0; i<totalElements; i++)
			{
				String num[] = br.readLine().split(" ");
				int num1 = Integer.parseInt(num[0]);
				int num2 = Integer.parseInt(num[1]);
				System.out.println("num1:"+num1+"\nnum2:"+num2);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}		
	}

}
