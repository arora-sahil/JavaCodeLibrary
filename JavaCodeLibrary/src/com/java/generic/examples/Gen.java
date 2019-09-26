package com.java.generic.examples;

public class Gen<T> {

    T ob;
    public Gen(T ob)
    {
        this.ob = ob;
    }

    public void show()
    {
        System.out.println("The type of object is"+ob.getClass().getName());
    }

    public T getOb()
    {
        return ob;
    }

}

class GenDemo
{
    public static void main(String[] args) {
        Gen<String> gen = new Gen<String>("Sahil");
        gen.show();
        System.out.println(gen.getOb());
        Gen<Integer> genIn = new Gen<Integer>(10);
        genIn.show();
        System.out.println(genIn.getOb());


    }
}
