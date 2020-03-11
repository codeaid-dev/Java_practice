import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class WhileExample extends JFrame {
	int center1 = 130;
	int yplace1 = 200;
	int size1 = 50;
	int center2 = 270;
	int yplace2 = 50;
	int size2 = 50;
	int reduce = 8;

	public WhileExample() {
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	/***** paint *****/
	public void paint(Graphics g) {
		g.setColor(Color.red);
		while(size1 > 10) {
			g.fillOval(center1 - size1, yplace1, size1 * 2, size1);
			size1 -= reduce;
			yplace1 -= size1;
		}

		g.setColor(Color.green);
		do {
			g.fillOval(center2 - size2, yplace2, size2 * 2, size2);
			yplace2 += size2;
			size2 -= reduce;
		} while(size2 > 10);
	}

	public static void main(String[] args) {
		new WhileExample();

	}

}
