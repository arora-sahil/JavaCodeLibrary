package com.java.challenges;

import java.util.*;

interface commonStudent
{
    Student makeStudent(StudentType primary, String item);
}
enum StudentType {
    HIGHSCHOOL, PRIMARY, OTHER;
}

public class MainFactory {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int _names_size = 0;
        _names_size = Integer.parseInt(in.nextLine().trim());
        String[] _names = new String[_names_size];

        String _names_item;
        for(int _names_i = 0; _names_i < _names_size; _names_i++) {
            try {
                _names_item = in.nextLine();
            } catch (Exception e) {
                _names_item = null;
            }
            _names[_names_i] = _names_item;
        }

        String _name1;
        for(int _names_i = 0; _names_i < _names_size; _names_i++) {
            _name1 = _names[_names_i];
            String[] items = _name1.split(":");
            Student student = null;
            switch (items[0]) {
                case "P":
                    student = PersonFactory.makeStudent(StudentType.PRIMARY, items[1]);
                    break;
                case "H":
                    student = PersonFactory.makeStudent(StudentType.HIGHSCHOOL, items[1]);
                    break;
                default:
                    student = PersonFactory.makeStudent(StudentType.OTHER, items[1]);
                    break;
            }
            System.out.println(student != null? student.getName() + " is a " + student.getSchoolType(): items[1] + " is a not a student");
        }
    }
}

abstract class Student {
    protected final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String getSchoolType()
    {
        return this.getClass().getSimpleName();
    }
}

class HighSchoolStudent extends Student implements commonStudent{

    public HighSchoolStudent(String name) {
        super(name);
    }

    @Override
    public HighSchoolStudent makeStudent(StudentType primary, String item) {
        HighSchoolStudent higSchoolstudent = new HighSchoolStudent(item);
        return higSchoolstudent;
    }
}

class PrimarySchoolStudent extends Student implements commonStudent {


    public PrimarySchoolStudent(String name) {
        super(name);
    }

    @Override
    public PrimarySchoolStudent makeStudent(StudentType primary, String item) {
        PrimarySchoolStudent primarySchoolStudent = new PrimarySchoolStudent(item);

        return primarySchoolStudent;
    }
}


class PersonFactory  {
    private static Student student =null;

    public static Student makeStudent(StudentType studentType, String item) {
        if(studentType == StudentType.PRIMARY) {
           student = new HighSchoolStudent(item);
        }
        else if(studentType == StudentType.HIGHSCHOOL)
        {
            student = new PrimarySchoolStudent(item);
        }
        else
        {
            student = null;
        }
        return student;
    }
}