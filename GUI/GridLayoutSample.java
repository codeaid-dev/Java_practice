import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class GridLayoutSample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("GridLayoutの例");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 400);

    frame.setLayout(new GridLayout(4, 3, 5, 5)); // 行, 列, 水平間隔, 垂直間隔
    for (int i = 1; i <= 9; i++) {
        frame.add(new JButton(String.valueOf(i)));
    }
    frame.add(new JButton("0"));
    frame.add(new JButton("+"));
    frame.add(new JButton("="));

    frame.setVisible(true);
  }
}
