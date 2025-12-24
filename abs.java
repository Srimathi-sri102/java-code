package srii;
abstract class track
{
	abstract  void source();
}
class abs extends track
{
	void source()
	{
		System.out.println("the file can be conclude");
	}
	void metho()
	{
		System.out.println("the metho can be cons");
	}
	public static void main(String[]args)
	{
		abs s=new abs();
		s.source();
		s.metho();	}
}

	

	

	