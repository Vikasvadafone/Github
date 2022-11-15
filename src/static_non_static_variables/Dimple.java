package static_non_static_variables;

public class Dimple {
	int k=50;//non static global variable 
	
	public static void main (String[] args) {
		
		Dimple v=new Dimple();
		
		System.out.println(v.k);
	}

}
