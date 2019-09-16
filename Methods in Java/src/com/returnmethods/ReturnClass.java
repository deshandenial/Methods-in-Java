package com.returnmethods;

public class ReturnClass 
{
	int age = 25 ;
	
	public int Age()
	{
		return age;
	}
	
	public static void main(String[] args) {
		
		ReturnClass cls = new ReturnClass();
		int result =cls.Age();
		System.out.println("Age : " +result);
	}

}
