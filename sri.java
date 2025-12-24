package srimathi;
import java.util.Scanner;
 interface B {
          void fruits();
          void flower();
}
 interface lotus
{
	void sound();

}
  class  sri implements B,lotus
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
		  sri b =new sri();
		  b.fruits();
		  b.flower();
		  b.sound();
				  
	  }
	  
	  
		  
	  
	  
 }
