package com.syntaxcheck;

public class Mainclass
{
	public void classtest() 
	{
		System.out.println("i belongs to main class");
	}

	public static void main(String[] args)
	{
		 Mainclass a = new Mainclass();
		 a.classtest();
		 Mainclass b= new Mainclass();
		 b.classtest();

	}

}
