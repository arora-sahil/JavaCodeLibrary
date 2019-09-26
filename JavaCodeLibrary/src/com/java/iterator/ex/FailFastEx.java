package com.java.iterator.ex;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastEx {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Iterator<String> i = list.iterator();
        String str = "";

        while (i.hasNext()) {
            str = (String) i.next();
            if (str.equals("B")) {
                i.remove();
                break;
            }
            //list.add("G"); //Concurrent Modification Exception

        }
        for (String s: list) {
            System.out.println(s);
        }

    }
}
