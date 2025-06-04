import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircleByMouse extends JPanel {
  int x = 100, y = 100;

  public MoveCircleByMouse() {
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
      }
    });
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.GREEN);
    g.fillOval(x - 15, y - 15, 30, 30);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("マウスに追従する円");
    frame.add(new MoveCircleByMouse());
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
