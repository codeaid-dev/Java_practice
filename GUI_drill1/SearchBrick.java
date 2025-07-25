import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SearchBrick extends JPanel {
  int[][] masu = new int[10][10];
  int[] atari = {new Random().nextInt(10), new Random().nextInt(10)};
  boolean clear = false;
  int mx = -1, my = -1;
  long start, spend;
  
  public SearchBrick() {
    start = System.currentTimeMillis();
    System.out.println("x: "+atari[0]+" y: "+atari[1]);
    setPreferredSize(new Dimension(500, 500));
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        mx = e.getX() / 50;
        my = e.getY() / 50;
        repaint();
      }
    });
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (int y = 0; y < 10; y++) {
      for (int x = 0; x < 10; x++) {
        g.setColor(Color.GRAY);
        g.fillRect(x*50, y*50, 50, 50);
        g.setColor(Color.WHITE);
        g.drawRect(x*50, y*50, 50, 50);
        if (mx == x && my == y && x == atari[0] && y == atari[1] && !clear) {
          clear = true;
          spend = System.currentTimeMillis() - start;
        }
        if (clear && x == atari[0] && y == atari[1]) {
          g.setColor(Color.RED);
          g.fillOval(x*50, y*50, 50, 50);
          g.setFont(new Font("Sans-Serif", Font.BOLD, 30));
          g.setColor(Color.BLACK);
          g.drawString("経過時間："+spend/1000+"秒", 140, 230);
        }
      }
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("当たりを探せ");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new SearchBrick());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
