import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FindAatari extends JPanel {
  int boxSize = 100;
  int boxY = (200-boxSize)/2;
  int space = (900-boxSize*5)/6;
  int mx = 0, my = 0;
  int atari = new Random().nextInt(5);
  boolean show = false;

  public FindAatari() {
    setPreferredSize(new Dimension(900, 200));
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        mx = e.getX();
        my = e.getY();
        repaint();
      }
    });
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (int i = 0; i < 5; i++) {
      g.setColor(Color.BLACK);
      g.fillRect(i*(boxSize+space)+space, boxY, boxSize, boxSize);
      if (i*(boxSize+space)+space<mx && mx<i*(boxSize+space)+space+boxSize
        && boxY<my && my<boxY+boxSize) {
        if (i == atari) {
          show = true;
        }
      }
      if (i == atari  && show) {
        g.setColor(Color.RED);
        g.fillOval(i*(boxSize+space)+space, boxY, boxSize, boxSize);
      }
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("当たりを探せ");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new FindAatari());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
