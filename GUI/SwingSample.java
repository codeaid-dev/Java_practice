import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SwingSample extends JFrame {
  public SwingSample() {
    setTitle("サンプル");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();

    JLabel label = new JLabel("こんにちは");
    JButton button = new JButton("押してね");
    panel.add(label);
    panel.add(button);

    button.addActionListener(
      e -> label.setText("こんにちは、Swing!")
      );

    getContentPane().add(panel);

    setSize(300,150);
    setLocationRelativeTo(null);
    setVisible(true);
  }
  public static void main(String[] args) {
    SwingUtilities.invokeLater(SwingSample::new);
  }
}
