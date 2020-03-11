/* 
 * class for Dobermann
 * by Treyson Yuuki Shimatani on 9/10/2018
 */

public class Dobermann extends Dog {
	
	public Dobermann(String breed_, String size_, int age_, String color_) {
		super(breed_, size_, age_, color_);
		showData();
	}
	
	public void showData() {
		System.out.println("Data of " + breed + " is " + size + ", " + age + " years old and " + color);
	}
	
	public static void main(String[] args) {
		Dobermann dobermann = new Dobermann("Dobermann", "Large", 5, "Black");
	}
}