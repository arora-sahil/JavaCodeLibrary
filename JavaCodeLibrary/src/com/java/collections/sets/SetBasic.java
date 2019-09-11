package com.java.collections.sets;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetBasic {

    public static void main(String[] args) {
        Set set = new TreeSet(new MyComparator());
        set.add("A");
        set.add("B");
        set.add(new StringBuffer("ABC"));
        set.add(new StringBuffer("AA"));
        set.add("XX");
        set.add(123);

        System.out.println(set);
    }
}
class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
       String s1 = obj1.toString();
       String s2 = obj2.toString();
       int l1 = s1.length();
       int l2 = s2.length();
       if(l1 > l2)
       {
           return -1;
       }
       else if(l2 > l1)
       {
           return +1;
       }
       else
       {
           return s1.compareTo(s2);
       }
    }
}
