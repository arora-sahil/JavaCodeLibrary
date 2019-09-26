package com.java.iterator.ex;

import java.util.*;

public class FailSafe {

    public static void main(String[] args) {
        //Fail Safe
        Date date= new Date();
        Vector<String> v=new Vector<String>();
        v.add("Amit");
        v.add("Raj");
        v.add("Pathak");
        v.add("Sumit");
        v.add("Aron");
        v.add("Trek");

        Iterator<String> it=v.iterator();
        while(it.hasNext())
        {
            String value=(String) it.next();
            System.out.println(value);
            //v.add("hh");
            it.remove(); // NO Exception and you can't modify while iterating
        }
    }
}
