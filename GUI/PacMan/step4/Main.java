import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JPanel {
  PacManWithEye pacman;

  public Main() {
    setPreferredSize(new Dimension(500, 500));
    pacman = new PacManWithEye(250, 250, 50, 60);

    setFocusable(true);
    requestFocusInWindow();

    addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        int x = pacman.getX();
        int y = pacman.getY();
        int radius = pacman.getRadius();
        switch (e.getKeyCode()) {
          case KeyEvent.VK_UP -> {
            pacman.setY(y-10);
            if (y < -radius) {
              pacman.setY(500+radius);
            }
            pacman.setDirection(0);
          }
          case KeyEvent.VK_DOWN -> {
            pacman.setY(y+10);
            if (y > 500+radius) {
              pacman.setY(-radius);
            }
            pacman.setDirection(1);
          }
          case KeyEvent.VK_LEFT -> {
            pacman.setX(x-10);
            if (x < -radius) {
              pacman.setX(500+radius);
            }
            pacman.setDirection(2);
          }
          case KeyEvent.VK_RIGHT -> {
            pacman.setX(x+10);
            if (x > 500+radius) {
              pacman.setX(-radius);
            }
            pacman.setDirection(3);
          }
        }
        repaint();
      }
    });
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    setBackground(Color.BLACK);
    pacman.draw(g);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("パックマンを描画");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new Main());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
