package com.java.inner;

public class InnerFromOutsideOfOuterClass {

    class Inner
    {
       public void m1()
       {
           System.out.println("Hi, this is inner class");
       }
    }

    public static void main(String[] args) {

        InnerFromOutsideOfOuterClass outer = new InnerFromOutsideOfOuterClass();
        InnerFromOutsideOfOuterClass.Inner i = new InnerFromOutsideOfOuterClass().new Inner();
        i.m1();

    }
}
