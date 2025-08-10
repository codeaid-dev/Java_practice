import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawLineOnDrag extends JPanel {
  private java.util.List<Point> points = new ArrayList<>();

  public DrawLineOnDrag() {
    setPreferredSize(new Dimension(500, 500));
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        points.add(e.getPoint());
        repaint();
      }
    });
    addMouseListener(new MouseAdapter() {
      public void mouseReleased(MouseEvent e) {
        points.add(null);
      }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        points.add(e.getPoint());
        repaint();
      }
    });
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    for (int i = 1; i < points.size(); i++) {
      Point p1 = points.get(i - 1);
      Point p2 = points.get(i);
      if (p1 != null && p2 != null) {
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
      }
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("マウスドラッグで線を描く");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new DrawLineOnDrag());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
