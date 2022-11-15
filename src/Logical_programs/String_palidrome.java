package Logical_programs;

public class String_palidrome {
	public static void main(String[] args) {
		
	
	String org="Boss";

	String rev="";
	
	for (int i=org.length()-1;i>=0;i--) {
		
		rev=rev+org.charAt(i);
		
	}
System.out.println(rev);
//check whether it is palindrome

       if (org.equals(rev)) {
	         System.out.println("give string is palindrome");
       }

        else {
	          System.out.println("give string is not palindrome");
       }
}
}
