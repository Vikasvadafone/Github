package package_variables;

public class Global_without_initalization {
	static byte b;
	static short s;
	static int i;
	static long l;
	static double d;
	static char ch;
	static boolean g;
	static String v;
	public static void main(String[] args) {
		System.out.println(b);//0
		System.out.println(s);//0
		System.out.println(i);//0
		System.out.println(l);//0
		System.out.println(d);//0.0
		System.out.println(ch);//empty character
		System.out.println(g);//false
		System.out.println(v);//null
		
		
	}

}
