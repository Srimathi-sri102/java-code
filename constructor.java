package srimathi;

public class constructor 
{
	constructor()
	{
		System.out.println("there is no parameter");
	}
	constructor(int a,int b)
	{
		System.out.println(a+b);
	}

	 public static void main(String[] args) 
	 {
		// TODO Auto-generated method stub
		constructor con1=new constructor();
		constructor con2=new constructor(3,4);

	 }

}
