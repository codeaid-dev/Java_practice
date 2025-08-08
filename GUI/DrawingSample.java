import javax.swing.*;
import java.awt.*;

public class DrawingSample extends JPanel {
  public DrawingSample() {
    setPreferredSize(new Dimension(400, 400));
  }
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.drawLine(10, 10, 100, 100); // 線
    g.drawRect(120, 20, 80, 50); // 四角形(枠線)
    g.setColor(Color.RED);
    g.fillRect(220, 20, 80, 50); // 四角形(塗りつぶし)
    g.setColor(Color.BLUE);
    g.fillOval(30, 150, 100, 100); // 円(塗りつぶし)
    g.setColor(Color.MAGENTA);
    g.drawOval(150, 150, 100, 100); // 円(枠線)
    g.setColor(Color.YELLOW);
    g.fillArc(270, 150, 100, 100, 30, 300); // 円弧(塗りつぶし)
    g.setColor(Color.CYAN);
    g.drawArc(270, 270, 100, 100, 30, 300); // 弧(線)

    // テキスト描画（フォントと色も指定）
    g.setFont(new Font("Serif", Font.BOLD, 20));
    g.setColor(Color.BLACK);
    g.drawString("こんにちは Swing", 50, 300);
    g.setFont(new Font("Sans-Serif", Font.BOLD, 20));
    g.setColor(Color.RED);
    g.drawString("こんにちは Swing", 50, 320);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("図形描画の例");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setSize(400, 400);
//    frame.add(new DrawingSample());
    frame.getContentPane().add(new DrawingSample());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
