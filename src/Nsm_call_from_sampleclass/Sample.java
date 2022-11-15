package Nsm_call_from_sampleclass;
//non static method call from sampleclass

public class Sample {
public void main (String[] args) {
		
		System.out.println("main method started");
		
		Sample s=new Sample();
		
		s.m1();
		s.m2();
		
		System.out.println("main method ends");
		
	}

	public void m1 () {//method declaration
		System.out.println("i am from m1 nonstatic method");//method implementation
		
	}
	public void m2 () {//method declaration
	     System.out.println("i am from m2 nonstatic method");//method implementation

     }

}
