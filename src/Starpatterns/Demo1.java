package Starpatterns;

public class Demo1 {
	public static void main(String[] args) {
		int star=1;
		
		for (int i=1; i<=5; i++) {//outer for 
			for (int j=1; j<=star; j++) {//inner for 
				System.out.print("*");
			}
			System.out.println();
			star++;
			
		}
	}

}
