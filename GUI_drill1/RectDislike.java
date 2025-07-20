import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RectDislike extends JPanel {
  int mouseX, mouseY;
  int rectX, rectY, rectS=50;
  public RectDislike() {
    setPreferredSize(new Dimension(500, 500));
    rectX = new Random().nextInt(500);
    rectY = new Random().nextInt(500);
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
      }
    });
  }
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (mouseX > rectX && mouseX < rectX+rectS
      && mouseY > rectY && mouseY < rectY+rectS) {
      rectX = new Random().nextInt(500);
      rectY = new Random().nextInt(500);
    }
    g.setColor(Color.BLACK);
    g.fillRect(rectX, rectY, rectS, rectS);
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame("嫌がる四角形");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new RectDislike());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
