import javax.swing.*;
import java.awt.*;

public class DrawCircleLikePyramid extends JPanel {
  public DrawCircleLikePyramid() {
    setPreferredSize(new Dimension(500, 500));
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    for (int row = 0; row < 9; row++) {
      for (int col = 0; col < row+1; col++) {
        int x = (250-(row-col)*25)+col*25;
        int y = row*50+25;
        g.fillOval(x-25, y-25, 50, 50);
      }
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("ピラミッドのように円を並べる");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new DrawCircleLikePyramid());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }  
}
