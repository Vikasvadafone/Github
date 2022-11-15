package static_non_static_variables;

public class Demo {
	static String s="velocity";
	String s1="vikas";
	
	public static void main(String[] args) {
		
		
		System.out.println(s);
		Demo d= new Demo();
		System.out.println(d.s1);
		
		
	}

}
