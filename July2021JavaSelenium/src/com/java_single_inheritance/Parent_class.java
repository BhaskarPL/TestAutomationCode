package com.java_single_inheritance;

public class Parent_class
{
      int pci=100;
      static int pcs=200;
      
      public void ParentClass_Instance_method_A()
      {
    	  System.out.println("Parent Class_Instance method_instance variable:pci :" + pci);
    	  System.out.println("Parent Class_Instance method_static variable:pcs: " + pcs);
      }
      public static void ParentClass_Static_method_B()
      {
    	  Parent_class objs = new Parent_class();
    	  System.out.println("Parent Class_static method_instance variable:pci :" + objs.pci);
    	  System.out.println("Parent Class_from static method_static variable:pcs: " + pcs);
      }
	public static void main(String[] args)
	{
		Parent_class objp = new Parent_class();		
		System.out.println("parent Class_instance variable:"+ objp.pci);
		System.out.println("parent Class_static variable:"+ Parent_class.pcs);
		System.out.println("--out put from Instance Method --");
		objp.ParentClass_Instance_method_A();
		System.out.println("--output from static method--");
		Parent_class.ParentClass_Static_method_B();
	}

}
