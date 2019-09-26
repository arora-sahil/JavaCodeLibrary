package com.java.serialize.deserailize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainExample {
    public static void main(String[] args) throws IOException {
        Animal animal = new Animal();

        FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(animal);
    }
}
