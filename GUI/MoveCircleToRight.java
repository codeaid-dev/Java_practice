import javax.swing.*;
import java.awt.*;

public class MoveCircleToRight extends JPanel {
  private int x = 0;

  public MoveCircleToRight() {
    setPreferredSize(new Dimension(400, 150));
    Timer timer = new Timer(30, e -> {
      x += 5;
      if (x > getWidth()) x = 0;
      repaint();
    });
    timer.start();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLUE);
    g.fillOval(x, 50, 30, 30);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("円を右に動かす");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new MoveCircleToRight());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
