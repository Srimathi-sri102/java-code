package srimathi;
import java.util.Scanner;
 interface A {
          void fruits();
          void flower();
}
 interface animal
{
	void sound();

}
  class  birds implements A,animal
 {
	  public void fruits()
	 {
		 Scanner sc=new Scanner(System.in);
		 int fruitsnumber=sc.nextInt();
		 System.out.println(fruitsnumber);
	 }
	  public void flower()
	  {
		  Scanner sd =  new Scanner(System.in);
		  int flowercount=sd.nextInt();
		  System.out.println(flowercount);
		  
	  }
	  public void sound()
	  {
		 Scanner sg = new Scanner(System.in);
		 int soundingtime=sg.nextInt();
		 System.out.println(soundingtime);
	  }
	  public static void main(String[]args)
	  {
		  birds b =new birds();
		  b.fruits();
		  b.flower();
		  b.sound();
				  
	  }
	  
	  
		  
	  
	  
 }
