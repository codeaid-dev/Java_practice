import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawCircleByMouse extends JPanel {
  int x = 100, y = 100;

  public DrawCircleByMouse() {
    setPreferredSize(new Dimension(400, 300));
    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
      }
    });
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLUE);
    g.fillOval(x - 15, y - 15, 30, 30);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("クリックした所に円を描く");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new DrawCircleByMouse());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
