import java.awt.Container;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Game extends JFrame {  
  public Game() {
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Game");
    setVisible(true);
  }

  public void paint(Graphics g) {
    Container cp = getContentPane();
    cp.setBackground(Color.ORANGE);
    //cp.setBackground(new Color(180,255,180));
  }

  public static void main(String args[]) {
    new Game();
  }
}