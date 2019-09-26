package com.java.file.io;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");

        System.out.println(file.exists());

        file.createNewFile();
        file.mkdir();
        System.out.println(file.exists());

    }
}
