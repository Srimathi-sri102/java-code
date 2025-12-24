package srimathi;
import java.util.Scanner;

public class Constructor2 {
	Constructor2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=sc.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter the value of b:");
		int b=sc2.nextInt();
		int sum=a+b;
		System.out.println("sum="+sum);
	
	}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor2 obj=new Constructor2();

	}

}
