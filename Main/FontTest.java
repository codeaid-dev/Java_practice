import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class FontTest extends JFrame {
	public FontTest() {
		setSize(400, 300); // setting window size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g) {
		Font font1 = new Font("Arial", Font.PLAIN, 30);
		g.setFont(font1);
		g.setColor(Color.blue);
		g.drawString("Information Science", 20, 50);
		Font font2 = new Font("Georgia", Font.ITALIC, 30);
		g.setFont(font2);
		g.setColor(Color.green);
		g.drawString("Information Science", 20, 100);
		Font font3 = new Font("Monaco", Font.BOLD, 30);
		g.setFont(font3);
		g.setColor(Color.red);
		g.drawString("Information Science", 20, 150);
		Font font4 = new Font("Rockwell", Font.ITALIC | Font.BOLD, 30);
		g.setFont(font4);
		g.setColor(Color.red);
		g.drawString("Information Science", 20, 200);
		Font font5 = new Font("Zapfino", Font.PLAIN, 20);
		g.setFont(font5);
		g.setColor(Color.red);
		g.drawString("Information Science", 20, 250);
	}

	public static void main(String[] args) {
		new FontTest();

	}

}
