import javax.swing.*;
import java.awt.*;

public class AspectRatio extends JFrame {
  public AspectRatio() {
    setTitle("アスペクト比");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 250);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);

    JPanel panel1 = new JPanel();
    JLabel widthLabel = new JLabel("幅: ");
    widthLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JTextField widthField = new JTextField(10);
    widthField.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel1.add(widthLabel);
    panel1.add(widthField);

    JPanel panel2 = new JPanel();
    JLabel heightLabel = new JLabel("高さ: ");
    heightLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JTextField heightField = new JTextField(10);
    heightField.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel2.add(heightLabel);
    panel2.add(heightField);

    JButton showButton = new JButton("計算");
    showButton.setFont(new Font("SansSerif", Font.PLAIN, 20));

    JLabel resultLabel = new JLabel("ここに結果を表示");
    resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));

    gbc.gridx = 0; gbc.gridy = 0;
    add(panel1, gbc);
    gbc.gridx = 0; gbc.gridy = 1;
    add(panel2, gbc);
    gbc.gridx = 0; gbc.gridy = 2;
    add(showButton, gbc);
    gbc.gridx = 0; gbc.gridy = 3;
    add(resultLabel, gbc);

    showButton.addActionListener(e -> {
      try {
        int width = Integer.parseInt(widthField.getText());
        int height = Integer.parseInt(heightField.getText());
        int g = gcd(width, height);
        int rw = width/g;
        int rh = height/g;
        resultLabel.setForeground(Color.BLACK);
        resultLabel.setText(rw+" : "+rh);
      } catch(NumberFormatException ex) {
        resultLabel.setForeground(Color.RED);
        resultLabel.setText("有効な数値を入力してください。");
      }
    });

    setVisible(true);
  }

  public int gcd(int num1, int num2) {
    if (num2 == 0) { return num1; }
    return gcd(num2, num1%num2);
  }

  public static void main(String[] args) {
    new AspectRatio();
  }
}
