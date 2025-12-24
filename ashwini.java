package srimathi;

public class ashwini {
	void ash()
	{
		System.out.println("default value");
	}
	void add(int a)
	{
		System.out.println(a);
	}
	void add(float a, float b)
	{
		System.out.println(a+b);
	}
	public static void main(String[]args)
	{
		ashwini ash=new ashwini();
		ash.ash();
		ash.add(10);
		ash.add(12,13);
		
		
	}
	
	

}
