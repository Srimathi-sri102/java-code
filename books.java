package srimathi;
public class books
{
	books()
	{
		System.out.println("some books tell some stories");
	}
	void act()
	{
		System.out.println("now acting an inheritance");
	}
}
  class storybook extends books 
  {
	   storybook()
	   {
	     System.out.println("the hitler");
       }
	  public static void main(String[] args)
	   {
	
            storybook obj=new storybook();
            obj.act();
	   }
   }
 