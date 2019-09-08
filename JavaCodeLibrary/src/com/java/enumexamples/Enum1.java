package com.java.enumexamples;

enum Weekdays{
    SUN,MON,TUE,WED,THURS,FRI;
    //,SUN   You can't declare same keyword twice
    int noOfFields= 6; //enum can have fields
    public static final String SAT = "SAT"; // By default every keyword is public static final
    void enumMethod()
    {
        System.out.println("Hi, I am Enum Method");
    }
        }
public class Enum1 {

    public static void main(String args[])
    {
        Weekdays week1 = Weekdays.WED;
        System.out.println(week1);
        Weekdays week2 =Weekdays.THURS;
        week2.noOfFields= 7; // Changing fields to 7
        int newList = week2.noOfFields;
        System.out.print("Week 1 fields:"+week1.noOfFields);
        System.out.println("\nweek 2 fields:"+newList);

        week1.enumMethod(); //Calling enum method

    }
}
