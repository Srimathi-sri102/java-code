package srimathi;
import java.util.Scanner;
public class month
{
 
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int s=sc.nextInt();
	switch(s)
	{
	case 1:
		System.out.println("jan-winter");
		break;
	case 2:
		System.out.println("feb-winter");
		break;
	case 3:
		System.out.println("mar-summer");
		break;
	case 4:
		System.out.println("apr-summer");
		break;
	case 5:
		System.out.println("may-peaksummer");
		break;
	case 6:
		System.out.println("june-peaksummer");
		break;
	case 7:
		System.out.println("july-summer");
		break;
	case 8:
		System.out.println("aug-winter");
		break;
	case 9:
		System.out.println("sep-rainy");
		break;
	case 10:
		System.out.println("oct-rainy");
		break;
	case 11:
		System.out.println("nov-little bit rainy");
		break;
	case 12:
		System.out.println("dec-winter");
		break;
    default:
    	System.out.println("invalid number");
    	break;
			
	}
	
}
}