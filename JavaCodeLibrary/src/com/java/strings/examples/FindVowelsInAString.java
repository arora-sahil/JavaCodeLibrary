package com.java.strings.examples;

import com.java.inputs.InputUtility;

public class FindVowelsInAString implements InputUtility {


    public static void main(String arg[])
    {
       String str = new FindVowelsInAString().takeStringInput();

       char chr[] = str.toLowerCase().toCharArray();
       int count =0;
       //approach1(chr, count);
       approach2(chr, count);
    }

    public static void approach1(char[] chr, int count)
    {
        for(char c : chr)
        {
            count += 1;

            if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                System.out.print(count+" ");
            }
        }
    }
    public static void approach2(char[] chr, int count)
    {
        for(char c : chr)
        {
            count += 1;
          if(("aeiou").indexOf(c) >= 0)
          {
              System.out.print(count+" ");
          }
        }
    }

}
