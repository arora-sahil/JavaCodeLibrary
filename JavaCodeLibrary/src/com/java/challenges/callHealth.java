package com.java.challenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class callHealth {
	
	public static void main(String args[] ) throws Exception {
        //Scanner
         Scanner s = new Scanner(System.in);
			long N = s.nextLong();
			long k = s.nextLong();
			long n = s.nextLong();
			long m = s.nextLong();
			long p = s.nextLong();
			long extravans = 0;
			long foodItems = N;
			long foodWasted = 0;
			long vans = n;
			
			while(N >0)
			{
				if(N >= (n*m+k))
				{
					N = N -(n*m+k);
					foodWasted += k;
				}
				else
				{
					N = N - (n*m);
				}
				if(foodWasted >p)
				{
					N = foodItems;
					foodWasted = 0;
					if(foodWasted - p <= m)
					{
						n += m;
					}
				}
			}
			extravans= n - vans;
			System.out.println(extravans);



    }

}
