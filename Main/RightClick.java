import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;


public class RightClick extends JFrame {
int size = 50;
	
	// Mylistener, which you do not have to use it. if you want to, you can change the name.
	public RightClick() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Mylisn mylistener = new Mylisn();
		addMouseListener(mylistener);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 250, 500, 500);
	}
		
	public static void main(String[] args) {
		
		new RightClick();
		}
		
		class Mylisn extends MouseAdapter{
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getModifiersEx());
				if((e.getModifiersEx() & MouseEvent.BUTTON3_DOWN_MASK) 
						==MouseEvent.BUTTON3_DOWN_MASK) {
					Graphics g = getGraphics();
					g.setColor(Color.red);
					g.fillOval(e.getX()-size/2, e.getY() - size/2, size, size);
					g.dispose();
				}else {
					Graphics g = getGraphics();
					g.setColor(Color.black);
					g.drawOval(e.getX()-size/2, e.getY() - size/2, size, size);
					g.dispose();
				}
			}
		}

	}
