package Logical_programs;

public class Reverse_string {
	public static void main(String[] args) {
		String org ="VIKAS";
		String rev ="";
		
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
	
	System.out.println(rev);
	}

}
