import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveRectByKeyWrap extends JPanel {
  int x = 200, y = 200;
  boolean up, down, left, right;

  public MoveRectByKeyWrap() {
    setPreferredSize(new Dimension(500, 500));
    Timer timer = new Timer(16, e -> {
      int move=10;
      if (up) {
        y -= move;
        if (y < -100) {
          y = 500;
        }
      }
      if (down) {
        y += move;
        if (y > 500) {
          y = -100;
        }
      }
      if (left) {
        x -= move;
        if (x < -100) {
          x = 500;
        }
      }
      if (right) {
        x += move;
        if (x > 500) {
          x = -100;
        }
      }
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
    g.setColor(Color.BLUE);
    g.fillRect(x, y, 100, 100);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("画面を超えて四角形が移動");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new MoveRectByKeyWrap());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
