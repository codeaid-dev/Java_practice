import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircleByKeyEx extends JPanel {
  int x = 100, y = 100;
  boolean up, down, left, right;

  public MoveCircleByKeyEx() {
    Timer timer = new Timer(16, e -> {
      if (up) y -= 10;
      if (down) y += 10;
      if (left) x -= 10;
      if (right) x += 10;
      repaint();
    });
    timer.start();

    setFocusable(true);
    requestFocusInWindow();

    addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
          case KeyEvent.VK_UP -> { up = true; }
          case KeyEvent.VK_DOWN -> { down = true; }
          case KeyEvent.VK_LEFT -> { left = true; }
          case KeyEvent.VK_RIGHT -> { right = true; }
        }
      }

      public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
          case KeyEvent.VK_UP -> { up = false; }
          case KeyEvent.VK_DOWN -> { down = false; }
          case KeyEvent.VK_LEFT -> { left = false; }
          case KeyEvent.VK_RIGHT -> { right = false; }
        }
      }
    });
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.fillOval(x, y, 30, 30);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("矢印キーで円をスムーズに動かす");
    MoveCircleByKeyEx panel = new MoveCircleByKeyEx();
    frame.add(panel);
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
