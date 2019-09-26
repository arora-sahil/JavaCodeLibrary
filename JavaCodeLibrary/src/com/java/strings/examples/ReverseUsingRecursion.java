package com.java.strings.examples;

public class ReverseUsingRecursion {
    public static void main(String[] args) {

        String str = "sahilarora";
        int length = str.length() - 1;
        char characters[] = str.toCharArray();
        reverseString(characters, length);

    }
    private static void reverseString(char characters[], int length)
    {
        if(length == 0)
        {
            System.out.println(characters[length]);
            return;
        }
        System.out.print(characters[length]);

       reverseString(characters,length -1);
    }
}
