import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Password extends JFrame {
  public Password() {
    setTitle("パスワード生成");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);

    // --- 桁数の入力 ---
    JPanel panel1 = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);
    gbc.gridx = 0; gbc.gridy = 0;
    JLabel label1 = new JLabel("桁数:");
    label1.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel1.add(label1, gbc);
    gbc.gridx = 1; gbc.gridy = 0;
    JTextField digit = new JTextField(10);
    digit.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel1.add(digit, gbc);

    // --- 生成ボタン ---
    JPanel panel2 = new JPanel();
    JButton button = new JButton("生成");
    button.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel2.add(button);

    // --- 結果の表示 ---
    JPanel panel3 = new JPanel();
    JLabel result = new JLabel("ここに表示");
    result.setFont(new Font("SansSerif", Font.PLAIN, 16));
    panel3.add(result);

    setLayout(new GridBagLayout());
    gbc = new GridBagConstraints();
    gbc.insets = new Insets(1, 1, 1, 1);
    gbc.gridx = 0; gbc.gridy = 0;
    add(panel1, gbc);
    gbc.gridx = 0; gbc.gridy = 1;
    add(panel2, gbc);
    gbc.gridx = 0; gbc.gridy = 2;
    add(panel3, gbc);

    button.addActionListener(e -> {
      String lowercase = "abcdefghijklmnopqrstuvwxyz";
      String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String number = "0123456789";
      String symbol = "!@#$%^&*()_+-=[]{};:,.<>?";
      String num = digit.getText();
      try {
        int keta = Integer.parseInt(num);
        if (keta >= 8 && keta <= 32) {
          Random rand = new Random();
          char[] array = new char[keta];
          int index = 0;
          array[index++] = lowercase.charAt(rand.nextInt(lowercase.length()));
          array[index++] = uppercase.charAt(rand.nextInt(uppercase.length()));
          array[index++] = number.charAt(rand.nextInt(number.length()));
          array[index++] = symbol.charAt(rand.nextInt(symbol.length()));
          String allChars = lowercase + uppercase + number + symbol;
          while (index < keta) {
            array[index++] = allChars.charAt(rand.nextInt(allChars.length()));
          }
          for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
          }
          result.setForeground(Color.BLACK);
          result.setText(String.valueOf(array));
        } else {
          result.setForeground(Color.RED);
          result.setText("桁数は8-32の整数を入力してください。");
        }
      } catch (NumberFormatException ex) {
        result.setForeground(Color.RED);
        result.setText("桁数は8-32の整数を入力してください。");
      }
    });

    setVisible(true);
  }

  public static void main(String[] args) {
    new Password();
  }
}
