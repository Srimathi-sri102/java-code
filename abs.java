package srimathi;

abstract class abs {
	abstract void add();
	{
		
	}
	void display()
	{
		int a =10;
		System.out.println(a);
	}
}
class ash extends abs
{
	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public static void main(String[]args)
	{
		ash s =new ash();
		s.add();
		s.display();
		
	}

}
