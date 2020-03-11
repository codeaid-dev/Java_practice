/* 
 * class for Maltese
 * by Treyson Yuuki Shimatani on 9/10/2018
 */

public class Maltese extends Dog {
	public Maltese(){
		

		breed = "Maltese";
		size = "Small";
		age = 2;
		color = "White";
		showData();
	}

	public static void main(String[] args) {
		new Maltese();
	}
}
