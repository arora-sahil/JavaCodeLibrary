package com.java.interview.objecttypes;

//Java program to illustrate 
//working of toString() method 
class ToStrObjType { 
 String name; 
 int age; 
 String college; 
 String course; 
 String address; 
 ToStrObjType 
 (String name, int age, String college, String course, String address) 
 { 
     this.name = name; 
     this.age = age; 
     this.college = college; 
     this.course = course; 
     this.address = address; 
 }
 
@Override
public String toString() {
	
	return "ToStrObjType [name=" + name + ", age=" + age + ", college=" + college + ", course=" + course + ", address="
			+ address + "]";
}

public static void main(String[] args) 
 { 
	ToStrObjType b =  
     new ToStrObjType("Gulpreet Kaur", 21, "BIT MESRA", "M.TECH", "Kiriburu"); 
     System.out.println(b); 
     System.out.println(b.toString()); 
 } 
} 
