package srii;

 class code
 {
	 void java()
	 {
		 System.out.println("the java is override");
	 }
 }
class override extends code
{
	void java()
	{
		System.out.println("the code is excuted");
	}
  public static void main(String [] args) 
   {
   //code ob2=new code();
   override obj=new override();
    obj.java();
    //ob2.java();
   }
}
    
	

	