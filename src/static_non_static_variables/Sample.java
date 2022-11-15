package static_non_static_variables;

public class Sample {//class body open 
	static int i=10;//static global variable
	
	int j=20;//non-static golbal variable
	
	public static void main(String[] args) {//main method body open
		
		System.out.println(i);//since is static variable so that we can print directly
		
		Sample A=new Sample();//there are is create in object
		
		System.out.println(A.j);//20
		
		
	}//main method body close

}//class body close
