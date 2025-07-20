import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleChase extends JPanel {
  int mouseX=-1, mouseY=-1;
  int circleX=250, circleY=250, circleS=50;
  public CircleChase() {
    setPreferredSize(new Dimension(500, 500));
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
      }
    });
    Timer timer = new Timer(30, e -> {
      repaint();
    });
    timer.start();
  }
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (mouseX != -1 && mouseY != -1) {
      if (circleX < mouseX) circleX += 5;
      if (mouseX < circleX) circleX -= 5;
      if (circleY < mouseY) circleY += 5;
      if (mouseY < circleY) circleY -= 5;
    }
    g.setColor(Color.RED);
    g.fillOval(circleX-circleS/2, circleY-circleS/2, circleS, circleS);
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame("ついてくる円");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new CircleChase());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
