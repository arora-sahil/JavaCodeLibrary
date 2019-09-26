package com.java.lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(18);
        list.add(25);
        list.add(3);
        list.add(40);
        list.add(0);
        list.add(0);
        list.add(40);

        approach1(list);
        approach2(list);
    }


    private static void approach2(ArrayList<Integer> list) {

        Set<Integer> set = new HashSet<Integer>(list);
//        set.addAll(set);
//        for(int a : list) {
//            set.add(a);
//        }
        System.out.println(set);
    }

    private static void approach1(List<Integer> list)
    {
        List<Integer> newList = new ArrayList<Integer>();
        for(int a : list)
        {
            if(!newList.contains(a)) {
                newList.add(a);
            }
        }
        System.out.println(newList);
    }
}
