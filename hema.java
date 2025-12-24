package srimathi;

import java.util.Scanner;

public class hema {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
System.out.println("Enter value for a:");
		int a=sc.nextInt();
		System.out.println("Enter value for b:");
		int b=sc.nextInt();
		
		{
		  if(a>b)
		 {
			 System.out.println("a is greater than b");
		 }
		  else if(a>=b)
		  {
			  System.out.println("a is greater than equal b");
		  }
		  else if(b>a)
		  {
			  System.out.println("b is less than a ");
		  }
		  else
		  {
			  System.out.println("both are equal");
		  }
		}	  
		   
		    	
	sc.close();	  
				
		}
	

	}


