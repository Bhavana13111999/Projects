package com.Bhavana.sl.PracticeProjects;
//Class,Objects and  OOP's Concepts//
public class Person {
	  String name; 
	    int age; 
	    String color; 
	    public Person(String name, 
	 int age, String color) 
	    { 
	        this.name = name; 
	        this.age = age; 
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    } 
	   public int getAge() 
	    { 
	        return age; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("Hi my name is "+ this.getName()+ " ,my age is " + this.getAge()+ ", and my color is "+ this.getColor() + "."); 
	    } 
	    public static void main(String[] args) 
	    { 
	        Person p = new Person("Bhavana", 20, "white"); 
	        System.out.println(p.toString()); 
	    } 
	}


