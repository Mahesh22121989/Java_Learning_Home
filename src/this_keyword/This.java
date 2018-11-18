package this_keyword;


/*this() is a constructor used within the class

whenever we want to use constructor from the same class then we use this() keyword

this keyword is used to access and variables and methods of same class*/


public class This {

	public static void main(String[] args) {
		
This th=new This(4, 7, 8);
	}
	
	This(int x,int y,int z)
	{
		this(x,y);
		System.out.println("value of z is ::"+z);
	}
	This(int x,int y)
	{
		this(x);
		System.out.println("value of y ::" + y);
	}
	This(int x)
	{
		System.out.println("value of x ::" + x);
	}
	
	void Test1()
	{
		
	}
	

}
