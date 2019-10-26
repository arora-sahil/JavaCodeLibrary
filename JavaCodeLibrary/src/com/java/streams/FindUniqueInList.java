package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindUniqueInList{
    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        list.add("sahil");
        list.add("rahul");
        list.add("sahil");
        list.add("robin");
        list.add("sachin");
        long count = list.stream().count();

        List<String> newList = list.stream().distinct().collect(Collectors.toList());

        System.out.println("count: "+count);

        //Filter name with Sahil
        Stream<String> stream = list.stream();
        stream = stream.filter((String name) -> name=="sahil");
        List<String> specificNames = stream.collect(Collectors.toList());

        System.out.println(specificNames);
        System.out.println(newList);


    }
}
