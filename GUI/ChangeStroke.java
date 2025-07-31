import javax.swing.*;
import java.awt.*;

public class ChangeStroke extends JPanel {
  public ChangeStroke() {
    setPreferredSize(new Dimension(400, 300));
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    // GraphicsをGraphics2Dにキャスト
    Graphics2D g2 = (Graphics2D) g;
    // 線の太さを5に設定
    g2.setStroke(new BasicStroke(1.0f));
    g2.drawLine(20, 20, 50, 280);
    g2.setStroke(new BasicStroke(5.0f));
    g2.drawLine(70, 20, 100, 280);
    g2.setStroke(new BasicStroke(3.0f));
    g2.drawLine(120, 20, 150, 280);

    g2.drawOval(180, 20, 100, 100);
    g2.setStroke(new BasicStroke(5.0f));
    g2.drawOval(290, 20, 100, 100);
    g2.setStroke(new BasicStroke(5.0f));
    g2.drawRect(180, 180, 100, 100);
    g2.setStroke(new BasicStroke(1.0f));
    g2.drawRect(290, 180, 100, 100);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("線・枠線の太さを指定する");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new ChangeStroke());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }  
}
