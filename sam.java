package srii;
class mas
{
	mas()
	{
		System.out.println("the mas is super class");
	}
	mas(String a)
	{
		System.out.println("this is class");
	}
	void pack()
	{
		System.out.println("this is package");
	}
}

class sam extends mas
{
	sam()
	{super();
		System.out.println("tha sam is child class");
	}
	sam(String b)
	{
		System.out.println("this is str class");
	}
	void pack()
	{
		System.out.println("this is packk");
	}

	public static void main(String[] args) {
		//mas m=new mas();
	    //mas m1=new mas(sri);
	    sam s1=new sam();
	    //sam s2=new sam(dhivi);
	     s1.pack(); 
		
	}

}
