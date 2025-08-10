import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeColor extends JPanel {
  int[][] masu = new int[5][5];
  Color[] color = {Color.BLACK, Color.RED, Color.GREEN, Color.BLUE};
  int mx = -1, my = -1;
  
  public ChangeColor() {
    setPreferredSize(new Dimension(500, 500));
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        mx = e.getX() / 100;
        my = e.getY() / 100;
        repaint();
      }
    });
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (int y = 0; y < masu.length; y++) {
      for (int x = 0; x < masu[y].length; x++) {
        if (mx == x && my == y) {
          masu[y][x] = masu[y][x] % 3 + 1;
        }
        g.setColor(color[masu[y][x]]);
        g.fillRect(x*100, y*100, 100, 100);
        g.setColor(Color.WHITE);
        g.drawRect(x*100, y*100, 100, 100);
      }
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("クリックして色を変える");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new ChangeColor());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
