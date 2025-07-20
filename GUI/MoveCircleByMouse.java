import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircleByMouse extends JPanel {
  int x = 100, y = 100;

  public MoveCircleByMouse() {
    setPreferredSize(new Dimension(400, 300));
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
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new MoveCircleByMouse());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
