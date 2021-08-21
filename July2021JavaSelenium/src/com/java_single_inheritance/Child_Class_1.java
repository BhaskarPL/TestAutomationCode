package com.java_single_inheritance;

public class Child_Class_1 extends Parent_class //IS A relationship
{
	int cci=100;
	static int ccp=200;
	
	public void child_class_instance_method_C()
	{
		System.out.println("Child Class_Instance method_instance variable:cci :" + cci);
		System.out.println("Child Class_instance method_static veriable:ccp:" + ccp);
	}
	public static void child_class_static_method_D()
	{
		Child_Class_1 objs = new Child_Class_1();
		System.out.println("Child Class_static method_instance variable:cci :" + objs.cci);
		System.out.println("Child Class_static method_static veriable:ccp:" + ccp);
	}
	public static void main(String[] args)
	{ 	//only parent class methods and variables can be accessed
		Parent_class pcobj = new Parent_class();//HAS A Relation Ship
		System.out.println("---accessed parents class Variable by parent class object in child class--");
		System.out.println("PCI: "+ pcobj.pci);
		System.out.println("PCS: "+pcobj.pcs);
		System.out.println("---accessed parents class  methods by parent class object in child class--");
		pcobj.ParentClass_Instance_method_A();
		pcobj.ParentClass_Static_method_B();
		
		  System.out.println("---accessed Child class methods by child class object--");
	      Child_Class_1 ccobj = new Child_Class_1();
	      ccobj.child_class_instance_method_C();
	      ccobj.child_class_static_method_D();
	      System.out.println("---accessed parents class methods by child class object--");
	      ccobj.ParentClass_Instance_method_A();
	      ccobj.ParentClass_Static_method_B();
	      System.out.println("Accessed parent class variable by child class object--");
	      System.out.println("PCI:  "+ ccobj.pci);
	      System.out.println("PCS:  "+ ccobj.pcs);
	      
	      
	      
	}

}

