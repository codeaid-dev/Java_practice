import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class VectorGraphics extends JFrame {

	public VectorGraphics() {
		setSize(400, 300);	// setting window size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	/***** paint *****/
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawLine(50, 50, 150, 50);
		g.drawRect(50, 80, 100, 50);
		g.setColor(Color.green);
		g.fillRect(200, 80, 100, 50);
		g.setColor(Color.magenta);
		g.drawOval(50, 150, 100, 50);
		g.setColor(Color.yellow);
		g.fillOval(200, 150, 100, 50);
		g.setColor(Color.black);
		g.drawArc(50, 220, 100, 50, 45, 225);
		g.setColor(Color.cyan);
		g.fillArc(200, 220, 100, 50, 45, 225);
	}

	public static void main(String[] args) {
		new VectorGraphics();

	}

}
