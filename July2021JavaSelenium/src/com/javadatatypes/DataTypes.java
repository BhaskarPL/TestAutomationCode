package com.javadatatypes;

public class DataTypes
{
	//integer data types, these are instance variable and primitive type variables
	byte b=1;
	short s=1;
	int i=1;
	long l=1;
	//floating point data types,these are instance variables
	float f=1.0f;
	double d=1.0;
	//non numeric data types	
	char c='f';
	boolean bb=true;
	// string is class type variable starts with Capital letters and primitive instance variables
	String str="Instance Variables";
	// all the above variables are primitive type and instance variables (i.e not static variable)
	// Declare all primitive variable of static type 
	static byte b1=2;
	static short s1=2;
	static int i1=2;
	static long l1=2;
	//floating point data types and static type variables
	static float f1=2.0F;
	static double d1=2.0;
	//non numeric data types static type	
	static char c1 ='s';
	static boolean bb1=true;
	static String str1="Static Variables";
	
	/* How to access above instance and static variables in instance methods & 
	static method as shown below*/
	// Declare one instance method and static method
	
	public void m1()// instance method 
	{
		System.out.println("--Instance variables accessed in instance methods directly-----");
		System.out.println("byte:  "+b);
		//System.out.println("byte:"+ DataTypes.b);
		System.out.println("short:  "+s);
		System.out.println("int:  "+ i);
		System.out.println("long:  "+l);
		System.out.println("float:  "+f);
		System.out.println("char:  "+c);
		System.out.println("boolean:  "+bb);
		System.out.println("String:  "+str);
		System.out.println("--static variables accessed in instance methods directly---------");
		// static variables accessed in instance methods directly
		System.out.println("byte: "+ b1);
		System.out.println("Short:  "+s1);
		System.out.println("int:   "+i1);
		System.out.println("long:  "+l1);
		System.out.println("float: "+f1);
		System.out.println("char: "+c1);
		System.out.println("boolean: "+bb1);
		System.out.println("String:"+str);
		System.out.println("--static variables accessed in instance methods using calss name.variable---------");
	    System.out.println("byte: "+ DataTypes.b1);
	    System.out.println("Short:  "+DataTypes.s1);
		System.out.println("int:   "+DataTypes.i1);
		System.out.println("long:  "+DataTypes.l1);
		System.out.println("float: "+DataTypes.f1);
		System.out.println("char: "+DataTypes.c1);
		System.out.println("boolean: "+DataTypes.bb1);
		System.out.println("String: "+ DataTypes.str1);
	    
	}		
	public static void m2()  //static method 
	{
		System.out.println("--Instance variables accessed in static methods using calss obejct---------");
		DataTypes dt = new DataTypes();
		System.out.println("byte: "+ dt.b);// Instance variables are accessed using call objects  and class object is dt in this case
		System.out.println("short: " + dt.s);
		System.out.println("int: "+ dt.i);
		System.out.println("long: "+ dt.l);
		System.out.println("float: "+dt.f);
		System.out.println("char: "+ dt.c);
		System.out.println("boolean: "+ dt.bb);
		System.out.println("String: "+ dt.str);
		System.out.println("--static variables accessed in static methods directly---------");
		System.out.println("byte: "+ b1);
		System.out.println("Short:  "+s1);
		System.out.println("int:   "+i1);
		System.out.println("long:  "+l1);
		System.out.println("float: "+f1);
		System.out.println("char: "+c1);
		System.out.println("boolean: "+bb1);
		System.out.println("String:"+str1);
		System.out.println("--static variables accessed in static methods using calssname.variable--");
		System.out.println("byte: "+ DataTypes.b1);
	    System.out.println("Short:  "+DataTypes.s1);
		System.out.println("int:   "+DataTypes.i1);
		System.out.println("long:  "+DataTypes.l1);
		System.out.println("float: "+DataTypes.f1);
		System.out.println("char: "+DataTypes.c1);
		System.out.println("boolean: "+DataTypes.bb1);
		System.out.println("String: "+ DataTypes.str1);
	}
	
	public static void main(String[] args)
	{
		DataTypes obj = new DataTypes();
				obj.m1();
			DataTypes.m2();
			DataTypes.m2();
			
	}

}
