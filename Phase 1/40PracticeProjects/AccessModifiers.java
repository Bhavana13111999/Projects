
package com.Bhavana.sl.PracticeProjects;

 class Demo {
	
	private int a=10;  
	public int b=20; 
	int c=30;
	protected int d=40;
	}  
	  
	public class AccessModifiers extends Demo
	{  
	 public static void main(String args[]){  
		 AccessModifiers obj=new AccessModifiers();  
	   System.out.println(obj.b);//it prints 20  
	   //System.out.println(obj.a);//it gives compile time errror since a is private variable
	   System.out.println(obj.c);//it prints 30 as it belongs to same package
	   System.out.println(obj.d);//it prints  45 as class B is extending class A 
	   
	   }  
	}  


