package Constructor_Desiging;

public class Guns {//BLC
	String gunsName;
	int noOfBullets;
	public Guns(String gunsName,int noOfBullet) {
		
		this.gunsName=gunsName;
		this.noOfBullets=noOfBullet;
		
	}
public void shoot() {
	for (int i=1; i<=noOfBullets; i++) {
		System.out.println("deshkew");
	}
}
}
