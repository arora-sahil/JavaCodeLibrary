package com.java.maps;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapWithCustomisedKey {

    public static void main(String arg[])
    {
        HashMap<Student, String> students = new HashMap<Student, String>();

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Sahil");

        Student student2 = new Student();
        Student student3 = new Student();
        student2.setId(2);
        student2.setName("rahul");

        students.put(student1,"sahil");
        students.put(student2,"rahul");
        students.put(student3,"hey");


        System.out.println(students.get(student1));
        System.out.println(students);

        System.out.println(students.keySet().contains(student1));
        System.out.println(students.keySet().contains(student2));


        HashSet<Student> studentsSet = new HashSet<Student>();
        studentsSet.add(student1);
        studentsSet.add(student2);
        System.out.println(studentsSet.contains(student2));
        System.out.println(student1.hashCode() == student3.hashCode());

    }
}
