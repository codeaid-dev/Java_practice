/* 
 * Dog super class
 * by Treyson Yuuki Shimatani on 9/10/2018
 */

public class Dog {
	String breed;
	String size;
	int age;
	String color;
	
	public Dog(String breed_, String size_, int age_, String color_) {
		breed = breed_;
		size = size_;
		age = age_;
		color = color_;
	}

	public Dog() {
	}

	public void showData() {
		System.out.println("Breed is " + breed);
		System.out.println("Size is " + size);
		System.out.println("Age is " + age + " years old");
		System.out.println("Color is " + color);
	}
}
