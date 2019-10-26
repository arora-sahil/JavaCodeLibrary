package com.java.lambdas;

public class SimpleMain {
    public static void main(String[] args) {

        FuncInterface funcInterface= (a,b) ->{

            return a+b;
        };
        funcInterface.m2(10,10);
    }
}
