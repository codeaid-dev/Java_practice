import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveRectByKey extends JPanel {
  int x = 200, y = 200;
  boolean up, down, left, right;

  public MoveRectByKey() {
    setPreferredSize(new Dimension(500, 500));
    Timer timer = new Timer(16, e -> {
      int move=10;
      if (up) y -= move;
      if (down) y += move;
      if (left) x -= move;
      if (right) x += move;
      if (y < 0) y += move;
      if (y+100 > 500) y -= move;
      if (x < 0) x += move;
      if (x+100 > 500) x -= move;
      repaint();
    });
    timer.start();

    // キーイベントを受け取れるのは「フォーカスを持つコンポーネント」だけなので、
    // フォーカスを受け取れるようにする
    setFocusable(true);
    requestFocusInWindow(); // 実際にこのパネルにキーボードフォーカスを要求する

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
    JFrame frame = new JFrame("矢印キーで四角形を動かす");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new MoveRectByKey());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
