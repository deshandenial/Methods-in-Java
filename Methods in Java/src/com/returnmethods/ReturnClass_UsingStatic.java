package com.returnmethods;

public class ReturnClass_UsingStatic
{

	public static String Methodname()
	{
		String name = "deshan";
		return name;
	}
	
	public static void main(String[] args) {
		String s =Methodname();
		System.out.println("name : " + s);
	}
}
