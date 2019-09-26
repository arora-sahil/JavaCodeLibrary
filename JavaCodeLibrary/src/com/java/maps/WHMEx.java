package com.java.maps;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class WHMEx {

    @Override
    public String toString() {
        return "WeakHashMapExample:";
    }

    public static void main(String[] args) {
        WHMEx obj = new WHMEx();
        WHMEx obj1 = new WHMEx();
        //TreeMap treeMap;
        WeakHashMap weakHashMap = new WeakHashMap<String,String>();
        HashMap hashMap = new HashMap<String,String>();


        weakHashMap.put(obj,"sahil");
        hashMap.put(obj1,"sahil");

        obj = null;
        obj1 = null;

        System.gc();

        System.out.println(weakHashMap);
        System.out.println(hashMap);


    }
}
