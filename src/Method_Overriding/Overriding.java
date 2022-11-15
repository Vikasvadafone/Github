package Method_Overriding;

public class Overriding {//ULC
	public static void main(String[] args) {
		System.out.println("take talk of cat");
		
		Cat c=new Cat();
		c.talk();
		
		System.out.println("take talk of dog");
		
		Dog d=new Dog();
		d.talk();
	}

}
