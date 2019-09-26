package com.java.inner;

public class InnerFromInstanceAreaOfOuterClass {

    class Inner
    {
        public void m1()
        {
            System.out.println("Hello, this is m1()");
        }
    }

    void m2()
    {
        Inner inner = new Inner();
        inner.m1();
        System.out.println("Hello, this is m2()");
    }

    public static void main(String[] args) {
        InnerFromInstanceAreaOfOuterClass outer = new InnerFromInstanceAreaOfOuterClass();
        outer.m2();
        System.out.println("Hello");
    }
}
