package com.icici.loans.carloans;

import java.io.FileInputStream;

public class SecondClass
{
	//Data properties
	int a=10,b=20,result;
	
	// Behaviors--Concrete behaviors
	
	public void add()
	{
		result=a+b;
		System.out.println("Add of a and b is:" + result);
	}
	public void sub()
	{
		result=a-b;
		System.out.println("Difference of a and b is:" + result);
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("we have created 2nd Class");
		
		 SecondClass obj=new SecondClass();//class object creation in main method only
		  obj.add();
		  obj.sub();
		
		 SecondClass obj2 = new SecondClass(); //Second object for the same class
		 
		 obj2.add();
		 obj2.sub();
	
	}
		


}
