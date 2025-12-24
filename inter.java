package srii;
import java.util.Scanner;
interface raj
{
	    void sun();
}
interface nar
{
	    void sun();
}
class inter implements raj,nar
 {
	   public void sun()
		{
			System.out.println("the file is sum");
			}
		void metho()
		{
			System.out.println("the metho can include:");
			int a=3, b=2;
			//int b=2;
			System.out.println(a+b);
		}
		public static void main(String[]args)
		{
			inter s=new inter();
			s.sun();
			s.metho();	}
	}

