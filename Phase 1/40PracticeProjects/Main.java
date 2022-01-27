package com.Bhavana.sl.PracticeProjects;
//Throw//
class ThrowDemo 
  {
  public static void main(String[] args)
  {

      int a=45,b=0,rs;

      try
      {
          if(b==0)        
              throw(new ArithmeticException("Can't divide by zero."));
          else
          {
              rs = a / b;
              System.out.print("\n\tThe result is : " + rs);
          }
      }
      catch(ArithmeticException Ex)
      {
          System.out.print("\n\tError : " + Ex.getMessage());
      }

      System.out.print("\n\tEnd of program.");
  }
}

class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
public class Main 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("temp"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}


