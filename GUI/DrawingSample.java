import javax.swing.*;
import java.awt.*;

public class DrawingSample extends JPanel {
  public DrawingSample() {
    setPreferredSize(new Dimension(400, 400));
  }
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.drawLine(10, 10, 100, 100); // 線を描く

    g.drawRect(120, 20, 80, 50); // 四角を描く（塗りなし）

    g.setColor(Color.RED);
    g.fillRect(220, 20, 80, 50); // 四角を描く（塗りつぶす）

    g.setColor(Color.BLUE);
    g.fillOval(50, 150, 100, 100); // 円を描く（塗りつぶす）

    g.setColor(Color.MAGENTA);
    g.drawOval(170, 150, 100, 100); // 円を描く（塗りなし）

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
