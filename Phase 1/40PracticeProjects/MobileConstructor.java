
package com.Bhavana.sl.PracticeProjects;


public class MobileConstructor {
	    String brand;
	    String name;
	    int price;
	    String ram;
	    MobileConstructor()
	    {
	    	
	    }
	    MobileConstructor(String b,String n,int p,String r){
	    	this.brand=b;
	    	this.name=n;
	    	this.price=p;
	    	this.ram=r;
	    }
		public static void main(String[] args) {
			 MobileConstructor m1=new MobileConstructor();
			 MobileConstructor m2=new MobileConstructor("ReadMi","8pro",20000,"8gb");
			 MobileConstructor m3=new MobileConstructor("Vivo","16pro",30000,"16gb");
			System.out.println(m2.brand+" "+m2.name+" "+m2.price+" "+m2.ram);
			System.out.println(m3.brand+" "+m3.name+" "+m3.price+" "+m3.ram);
	     }
	}



