package Logical_programs;

import java.util.Scanner;

public class Accept_input_from_user {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		
		//get 1st number from user
	System.out.println("Ley user enter 1st number");
	int num1 =s.nextInt();
	
	
	//get 2nd number from user
	System.out.println("Ley user enter 2nd number");
	
	int num2=s.nextInt();
	
	//add to number
	System.out.println(num1+num2);
	
	
	
	
	}

}
