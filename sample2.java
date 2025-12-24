package srimathi;

public class sample1{
	sample1()
	{
		System.out.println("non paramter constructor");
	}
	sample1(int c)
	{
		System.out.println("paramter constructor");
	}
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
}
 class sample2 extends sample1
 {
	 sample2()
	 {
		 System.out.println("child class with no parameter");
	 }
	 sample2(int c)
	 {super(c);
		 System.out.println(c);
	 }
	 public static void main(String[]args)
	 {
		sample2 sm = new sample2();
		sample2 sc=new sample2(10);
		sm.add(12, 13);
		
	 }
 }
	


