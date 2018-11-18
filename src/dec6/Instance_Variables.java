/**
 * 
 */
package dec6;

/*variables declared within the class and outside the methods, blocks and constructors.
instnce variables can be used only in instnce area/instance methods.
memory is allocated when object is created and memory releases when object is destroyed.*/


public class Instance_Variables {
// instance variables
int a=10;
int b=15;

//static method
	public static void main(String[] args) {
		
		// static area
		Instance_Variables iv=new Instance_Variables();
		System.out.println(iv.a);
		System.out.println(iv.b);
		iv.m1();

	}
	// instance methods
	void m1()
	{
		// instance area
		System.out.println(a);
		System.out.println(b);
		
	}

}
