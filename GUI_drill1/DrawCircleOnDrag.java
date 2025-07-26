import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class DrawCircleOnDrag extends JPanel {
  private Point center = null;   // マウス押下位置（円の中心）
  private Point edge = null;     // 現在のドラッグ位置（円の端）
  private List<List<Point>> circles = new ArrayList<>();

  public DrawCircleOnDrag() {
    setPreferredSize(new Dimension(500, 500));
    setBackground(Color.BLACK);
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        center = e.getPoint();
        edge = center;
        repaint();
      }

      public void mouseReleased(MouseEvent e) {
        edge = e.getPoint();
        if (center != null && edge != null) {
          List<Point> circle = new ArrayList<>();
          circle.add(new Point(center));
          circle.add(new Point(edge));
          circles.add(circle);
        }
        center = null;
        edge = null;
        repaint();
      }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        edge = e.getPoint();
        repaint();
      }
    });
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.YELLOW);

    for (List<Point> circle : circles) {
      Point cp = circle.get(0);
      Point ep = circle.get(1);
      int dx = ep.x - cp.x;
      int dy = ep.y - cp.y;
      double radius = Math.sqrt(dx * dx + dy * dy);

      int diameter = (int)(radius * 2);
      int upperLeftX = (int)(cp.x - radius);
      int upperLeftY = (int)(cp.y - radius);

      g.fillOval(upperLeftX, upperLeftY, diameter, diameter);
    }
    if (center != null && edge != null) {
      int dx = edge.x - center.x;
      int dy = edge.y - center.y;
      double radius = Math.sqrt(dx * dx + dy * dy);

      int diameter = (int)(radius * 2);
      int upperLeftX = (int)(center.x - radius);
      int upperLeftY = (int)(center.y - radius);

      g.setColor(Color.YELLOW);
      g.fillOval(upperLeftX, upperLeftY, diameter, diameter);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("マウスドラッグで円を描く");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new DrawCircleOnDrag());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
