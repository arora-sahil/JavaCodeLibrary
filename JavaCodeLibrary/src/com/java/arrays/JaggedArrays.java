package com.java.arrays;

public class JaggedArrays {

    public static void main(String arg[])
    {
        int[] OneDimensionalArray1 = {1, 2, 3};

        //One Dimensional Array of lenghth 4
        int[] oneDimensionalArray2 = {4, 5, 6, 7};

        //One Dimensional Array of lenghth 5
        int[] oneDimensionalArray3 = {8, 9, 10, 11, 12};

        //Jagged Two Dimensional Array
        int[][] twoDimensionalArray = {OneDimensionalArray1, oneDimensionalArray2, oneDimensionalArray3};

        for(int i=0;i<=twoDimensionalArray.length;i++)
        {
            for (int j=0;j<=twoDimensionalArray[i].length;j++)
            {
                System.out.print(twoDimensionalArray[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
