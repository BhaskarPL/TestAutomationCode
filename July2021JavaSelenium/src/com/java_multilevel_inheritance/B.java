package com.java_multilevel_inheritance;

public class B extends A
{

	public void m2()
	{
		System.out.println("I am from m2");
	}
	public static void main(String[] args)
	{
		B b = new B();
		b.m1();
		b.m2();
		
		A a = new A();
		a.m1();
		
	}

}
