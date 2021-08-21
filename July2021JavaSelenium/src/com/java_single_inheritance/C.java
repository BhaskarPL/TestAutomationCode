package com.java_single_inheritance;

import com.java_multilevel_inheritance.B;

public class C extends B
{
	public void m3()
	{
		System.out.println("I am from m3");
	}

	public static void main(String[] args)
	{
		 C c = new C();
		 c.m1();
		 c.m2();
		 c.m3();
		 
		 B b = new B();
		 b.m1();
		 b.m2();
		
	}

}
