import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class BorderLayoutSample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BorderLayoutの例");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);

    frame.setLayout(new BorderLayout());
    frame.add(new JButton("北 (North)"), BorderLayout.NORTH);
    frame.add(new JButton("南 (South)"), BorderLayout.SOUTH);
    frame.add(new JButton("東 (East)"), BorderLayout.EAST);
    frame.add(new JButton("西 (West)"), BorderLayout.WEST);
    frame.add(new JButton("中央 (Center)"), BorderLayout.CENTER);

    frame.setVisible(true);
  }
}
