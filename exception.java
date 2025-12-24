package srimathi;
import java.util.Scanner;
public class exception {
 public static void main(String[]args)
 {
	try
	{
		int a=10;
		int b=0;
		System.out.println(a/b);
		try
		{
			Scanner sc=new Scanner(System.in);
			int c= sc .nextInt();
			System.out.println("enter the number:"+c);
			if(c<=0)
			{
				System.out.println("negativity");
			}
		}
		catch(Exception e)
		{
			System.out.println("negativity");
		}
	}
	catch(Exception e) {
		System.out.println("divided by zero");
	}
 }

 
	
 }

