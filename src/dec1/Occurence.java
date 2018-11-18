/**
 * 
 */
package dec1;

/**
 * @author acer
 *
 */
public class Occurence {

	
	public static void main(String[] args) {
		String m="MALAYALAM";
		int sc=m.length();
		String n=m.substring(1, 3);
		String o=m.trim();
		String p=m.substring(4);
		String q=m.toLowerCase();
		char[] ma=m.toCharArray();
		System.out.println(sc);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		System.out.println(ma.length);
		int a=5;
		int b=a++ + ++a + a++;
		System.out.println(b);
		
		
	}

}
