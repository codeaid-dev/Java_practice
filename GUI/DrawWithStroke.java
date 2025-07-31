import javax.swing.*;
import java.awt.*;

public class DrawWithStroke extends JPanel {
  public DrawWithStroke() {
    setPreferredSize(new Dimension(300, 300));
  }
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    g2.setColor(Color.RED);
    g2.fillOval(50, 50, 150, 150);
    g2.setColor(Color.GREEN);
    g2.setStroke(new BasicStroke(5.0f));
    g2.drawOval(50, 50, 150, 150);
    g2.setColor(new Color(0, 0, 255, 128));
    g2.fillOval(100, 100, 150, 150);
    g2.setColor(Color.YELLOW);
    g2.setStroke(new BasicStroke(3.0f));
    g2.drawOval(100, 100, 150, 150);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("塗りつぶされた図形に枠線を付ける");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new DrawWithStroke());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }  
}
