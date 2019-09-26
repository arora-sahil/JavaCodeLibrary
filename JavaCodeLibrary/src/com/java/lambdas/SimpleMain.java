package com.java.lambdas;

public class SimpleMain {
    public static void main(String[] args) {

        FuncInterface funcInterface= () -> System.out.println("Hey I ma her");
        funcInterface.m2();
    }
}
