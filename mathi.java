package srimathi;

public class mathi 
{
    mathi()
    {
    	System.out.println("This is superclass");
    }
}
  class math1 extends mathi
  {
    math1()
    {
	   System.out.println("This i subclass");
    }
    public static void main(String[]args)
     {
    	math1 obj =new math1();
     }
  }


