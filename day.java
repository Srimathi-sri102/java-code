package srii;

import java.util.Scanner;

public class day 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
	    int a=sc.nextInt();
	    
	    if(a==1)
	    {
	    	System.out.println("day 1 is monday");
	    }
	    else if(a==2)
	    {
	    	System.out.println("day 2 is tuesday");
	    }
	    else if(a==3)
	    {
	    	System.out.println("day 3 is wednesday");
	    }
	    else if(a==4)
	    {
	    	System.out.println("day 4 is thrusday");
	    }
	    else if(a==5)
	    {
	    	System.out.println("day 5 is friday");
	    }
	    else if(a==6)
	    {
	    	System.out.println("day 6 is saturday");
	    }
	    else if(a==7)
	    {
	    	System.out.println("day 5 is sunday");
	    }
	    else
	    {
	    	System.out.println("there is none");
	    }
	    sc.close();
}
}
