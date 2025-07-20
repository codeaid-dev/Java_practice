import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircleByKey extends JPanel {
  int x = 100, y = 100;

  public MoveCircleByKey() {
    setPreferredSize(new Dimension(400, 300));
    setFocusable(true);
    requestFocusInWindow();

    addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
          case KeyEvent.VK_LEFT -> { x -= 10; }
          case KeyEvent.VK_RIGHT -> { x += 10; }
          case KeyEvent.VK_UP -> { y -= 10; }
          case KeyEvent.VK_DOWN -> { y += 10; }
        }
        repaint();
      }
    });
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.fillOval(x, y, 30, 30);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("矢印キーで円を動かす");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new MoveCircleByKey());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
