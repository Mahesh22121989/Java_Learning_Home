package dec6;

/*Local variables are declared within the method,constructors or blocks
Local variables can be accessed within the method,constructors or blocks
Local variables memory allocation will start when method starts and releases when method stops*/



public class Local_Variables {

	public static void main(String[] args) {
		
		m1();
		
		

	}
	static void m1()
	{
		int a=10;
		char c='m';
		int b=9;
		System.out.println(a+ c);
		System.out.println(a+b);
	}
	void m2()
	{
		
	}

}
