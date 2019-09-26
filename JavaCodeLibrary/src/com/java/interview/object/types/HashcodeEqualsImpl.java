package com.java.interview.object.types;

/* Java.lang.object has two very important methods defined: public boolean equals(Object obj) and public int hashCode(). */
class Geek
{
	private int id;
	private String name;
	
	Geek(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
	
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if ((obj == null ) || (getClass() != obj.getClass()))
			return false;
		
		Geek geek = (Geek) obj;
		
		
		return (this.id == geek.id && this.name == geek.name);
	}
	
	
	}
public class HashcodeEqualsImpl {

	public static void main(String args[])
	{
		Geek geek1 = new Geek(1,"sahil");
		Geek geek2 = new Geek(1,"sahil");
		
		if(geek1.hashCode() == geek2.hashCode())
		{
			if(geek1.equals(geek2))
			{
				System.out.println("Two objects are equal");
			}
			else {
				System.out.println("Two objects's hashcodes are equal only");

			}
		}
		
	}
	// Refer this article https://www.geeksforgeeks.org/equals-hashcode-methods-java/
}
