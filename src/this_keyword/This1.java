package this_keyword;

public class This1 {
	int a;
	int b;

	public static void main(String[] args) {
		This1 th=new This1(10,20);
		th.m1();
		
		
	}
	void m1()
	{
		System.out.println(a);
		System.out.println(this.a);
		this.m2(20);
	}
	void m2(int b)
	{
		System.out.println(b);
		System.out.println(this.a);
	}
	This1(int a,int b)
	{
		a=a;
		b=b;
		System.out.println("constructor A value is "+a);
		System.out.println("constructor B value is "+b);
	}
	
	
	
}
