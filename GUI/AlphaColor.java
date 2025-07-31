import javax.swing.*;
import java.awt.*;

public class AlphaColor extends JPanel {
  public AlphaColor() {
    setPreferredSize(new Dimension(300, 300));
  }
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.fillOval(50, 50, 150, 150);
    g.setColor(new Color(0, 0, 255, 128));
    g.fillOval(100, 100, 150, 150);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("色に透明度を指定する");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new AlphaColor());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }  
}
