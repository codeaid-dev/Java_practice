import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class DrawLineOnDragStroke extends JPanel {
  private List<LineInfo> lines = new ArrayList<>();
  private Point prevPoint = null;
  private JTextField strokeField;
  private int strokeWidth = 1;

  public DrawLineOnDragStroke(JTextField strokeField) {
    this.strokeField = strokeField;
    setPreferredSize(new Dimension(500, 500));
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        updateStrokeWidth();
        prevPoint = e.getPoint();
      }
    });
    addMouseListener(new MouseAdapter() {
      public void mouseReleased(MouseEvent e) {
        prevPoint = null;
      }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        Point currPoint = e.getPoint();
        if (prevPoint != null) {
          lines.add(new LineInfo(prevPoint, currPoint, strokeWidth));
        }
        prevPoint = currPoint;
        repaint();
      }
    });
  }

  private void updateStrokeWidth() {
    try {
      int value = Integer.parseInt(strokeField.getText());
      if (value > 0) strokeWidth = value;
      else strokeWidth = 1;
    } catch (NumberFormatException ex) {
      strokeWidth = 1;
    }
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    g.setColor(Color.BLACK);

    for (LineInfo info : lines) {
      g2.setStroke(new BasicStroke(info.width));
      g2.drawLine(info.p1.x, info.p1.y, info.p2.x, info.p2.y);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("線の太さを入力してドラッグで描画");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    JTextField strokeInput = new JTextField("1", 5);
    JPanel topPanel = new JPanel();
    topPanel.add(new JLabel("線の太さ: "));
    topPanel.add(strokeInput);

    DrawLineOnDragStroke drawPanel = new DrawLineOnDragStroke(strokeInput);

    frame.add(topPanel, BorderLayout.NORTH);
    frame.add(drawPanel, BorderLayout.CENTER);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

class LineInfo {
  Point p1, p2;
  int width;

  public LineInfo(Point p1, Point p2, int width) {
    this.p1 = p1;
    this.p2 = p2;
    this.width = width;
  }
}