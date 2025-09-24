import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {  
  public Game() {
    setPreferredSize(new Dimension(500, 500));
    setBackground(Color.ORANGE);
  }

    @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
  }

  public static void main(String args[]) {
    JFrame frame = new JFrame("ゲーム");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new Game());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}