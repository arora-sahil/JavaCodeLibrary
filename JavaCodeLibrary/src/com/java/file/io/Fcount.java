package com.java.file.io;

import java.io.*;
import java.util.*;

public class Fcount {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        examineFile(sc);
    }

    public static void examineFile(Scanner in) {
        int lines = 0;
        int words = 0;
        int chars = 0;
        double wordLength = 0;

        while (in.hasNext()) {
            String tmpStr = in.nextLine();
            if (!tmpStr.equalsIgnoreCase("")) {
                String replaceAll = tmpStr.replaceAll("\\s+", "");
                chars += replaceAll.length();
                words += tmpStr.split(" ").length;
            }
            ++lines;
        }

        if(lines >100)
        {
            wordLength = chars/words;
        }
        System.out.println("Total lines = " + lines);
        in.close();
    }
}