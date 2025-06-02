import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class FlowLayoutSample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("FlowLayoutの例");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);

    frame.setLayout(new FlowLayout(FlowLayout.LEFT));
    frame.add(new JButton("ボタン1"));
    frame.add(new JButton("ボタン2"));
    frame.add(new JButton("ボタン3"));

    frame.setVisible(true);
  }
}
