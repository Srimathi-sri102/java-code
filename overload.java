package srimathi;

public class overload
{
	void add()
	{
		System.out.println("the java");
	}
	void add(int a)
	{
		System.out.println(a);
	}
	void add(float c)
	{
		System.out.println(c);
	}
    public static void main(String[]args)
    {
	  overload obj=new overload();
      obj.add();
      obj.add(4);
      obj.add(2.1f);
    }
}
