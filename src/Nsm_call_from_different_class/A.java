package Nsm_call_from_different_class;

public class A {//User logic class
	public static void main (String[] args) {
		
		System.out.println("main method started");
		B b=new B();
		
		b.t1();
		b.t2();
		
		System.out.println("main method ended");
		
	}

}
