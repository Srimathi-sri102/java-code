package srii;
import java.util.Scanner;
public class pack
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
    int a=sc.nextInt();
    switch(a)
    {
    case 1:
    	System.out.println("jan-winter");
    	break;
    case 2:
    	System.out.println("feb-winter");
    	break;
    case 3:
    	System.out.println("march-summer");
    	break;
    case 4:
    	System.out.println("april-summer");
    	break;
    case 5:
    	System.out.println("may-heavy summer");
        break;
    case 6:
    	System.out.println("june-summer");
    	break;
    case 7:
    	System.out.println("july-summer");
    	break;
    case 8:
    	System.out.println("aug-rainyyy");
    	break;
    case 9:
    	System.out.println("sept-rainyy");
    	break;
    case 10:
    	System.out.println("oct-rainyy");
    	break;
    case 11:
    	System.out.println("nov-winter");
    	break;
    case 12:
    	System.out.println("dec-winter");
    	break;
    default:
    	System.out.println("error occured");
    	break;
    }
	}
	
    }
	
