package com.java.inner;

public class FromStaticAreaOfOuter {

    class Inner
    {

        public void m1()
        {
            System.out.println("Hello, this is m1()");
        }
    }

    public static void main(String[] args) {

        FromStaticAreaOfOuter outer = new FromStaticAreaOfOuter();
        FromStaticAreaOfOuter.Inner inner = outer.new Inner();

        new FromStaticAreaOfOuter().new Inner().m1();
        System.out.println("Hello");
    }

}
