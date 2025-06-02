import javax.swing.*;
import java.awt.*;

public class GridBagLayoutSample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("GridBagLayoutの例");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);

    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    gbc.insets = new Insets(5, 5, 5, 5); // 余白

    gbc.gridx = 0; gbc.gridy = 0;
    panel.add(new JLabel("名前:"), gbc);

    gbc.gridx = 1; gbc.gridy = 0;
    panel.add(new JTextField(15), gbc);

    gbc.gridx = 0; gbc.gridy = 1;
    panel.add(new JLabel("年齢:"), gbc);

    gbc.gridx = 1; gbc.gridy = 1;
    panel.add(new JTextField(5), gbc);

    gbc.gridx = 1; gbc.gridy = 2;
    panel.add(new JButton("送信"), gbc);

    frame.add(panel);
    frame.setVisible(true);
  }
}
