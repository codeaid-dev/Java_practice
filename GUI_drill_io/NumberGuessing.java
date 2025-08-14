import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class NumberGuessing extends JFrame {
  int num1, num2, num3;
  long start;
  boolean finish = false;

  public NumberGuessing() {
    setTitle("数当て");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 300);
    setLayout(new GridBagLayout());

    JPanel panel = new JPanel();
    panel.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);

    // --- 3つの数字を当てるラベルとフィールドを表示 ---
    JLabel num1Label = new JLabel("?");
    JLabel num2Label = new JLabel("?");
    JLabel num3Label = new JLabel("?");
    num1Label.setFont(new Font("SansSerif", Font.PLAIN, 20));
    num2Label.setFont(new Font("SansSerif", Font.PLAIN, 20));
    num3Label.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JTextField num1Field = new JTextField(3);
    JTextField num2Field = new JTextField(3);
    JTextField num3Field = new JTextField(3);
    num1Field.setFont(new Font("SansSerif", Font.PLAIN, 20));
    num2Field.setFont(new Font("SansSerif", Font.PLAIN, 20));
    num3Field.setFont(new Font("SansSerif", Font.PLAIN, 20));

    gbc.gridx = 0; gbc.gridy = 0;
    panel.add(num1Label, gbc);
    gbc.gridx = 1; gbc.gridy = 0;
    panel.add(num2Label, gbc);
    gbc.gridx = 2; gbc.gridy = 0;
    panel.add(num3Label, gbc);

    gbc.gridx = 0; gbc.gridy = 1;
    panel.add(num1Field, gbc);
    gbc.gridx = 1; gbc.gridy = 1;
    panel.add(num2Field, gbc);
    gbc.gridx = 2; gbc.gridy = 1;
    panel.add(num3Field, gbc);

    // --- 解答ボタン ---
    JButton ansButton = new JButton("解答");
    ansButton.setFont(new Font("SansSerif", Font.PLAIN, 20));

    // --- 結果の表示 ---
    JLabel resultLabel = new JLabel("ここに3つ当てた時間を表示");
    resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));

    // --- 別の問題を表示 ---
    JButton otherButton = new JButton("別の問題");
    otherButton.setFont(new Font("SansSerif", Font.PLAIN, 20));

    gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);
    gbc.gridx = 0; gbc.gridy = 0;
    add(panel, gbc);
    gbc.gridx = 0; gbc.gridy = 1;
    add(ansButton, gbc);
    gbc.gridx = 0; gbc.gridy = 2;
    add(resultLabel, gbc);
    gbc.gridx = 0; gbc.gridy = 3;
    add(otherButton, gbc);

    createQ();

    ansButton.addActionListener(e -> {
      int n1,n2,n3;
      try {
        n1 = Integer.parseInt(num1Field.getText());
      } catch(NumberFormatException ex) {
        n1 = 0;
      }
      try {
        n2 = Integer.parseInt(num2Field.getText());
      } catch(NumberFormatException ex) {
        n2 = 0;
      }
      try {
        n3 = Integer.parseInt(num3Field.getText());
      } catch(NumberFormatException ex) {
        n3 = 0;
      }
      if (n1 == num1) {
        num1Label.setForeground(Color.RED);
        num1Label.setText(String.valueOf(num1));
      } else if (n1 > num1) {
        num1Label.setForeground(Color.BLACK);
        num1Label.setText("LOW");
      } else {
        num1Label.setForeground(Color.BLACK);
        num1Label.setText("HIGH");
      }
      if (n2 == num2) {
        num2Label.setForeground(Color.RED);
        num2Label.setText(String.valueOf(num2));
      } else if (n2 > num2) {
        num2Label.setForeground(Color.BLACK);
        num2Label.setText("LOW");
      } else {
        num2Label.setForeground(Color.BLACK);
        num2Label.setText("HIGH");
      }
      if (n3 == num3) {
        num3Label.setForeground(Color.RED);
        num3Label.setText(String.valueOf(num3));
      } else if (n3 > num3) {
        num3Label.setForeground(Color.BLACK);
        num3Label.setText("LOW");
      } else {
        num3Label.setForeground(Color.BLACK);
        num3Label.setText("HIGH");
      }
      if (n1 == num1 && n2 == num2 && n3 == num3 && !finish) {
        resultLabel.setText("経過時間: "+((System.currentTimeMillis() - start) / 1000)+"秒");
        finish = true;
      }
    });

    otherButton.addActionListener(e -> {
      resultLabel.setText("ここに3つ当てた時間を表示");
      num1Label.setForeground(Color.BLACK);
      num1Label.setText("?");
      num2Label.setForeground(Color.BLACK);
      num2Label.setText("?");
      num3Label.setForeground(Color.BLACK);
      num3Label.setText("?");
      num1Field.setText("");
      num2Field.setText("");
      num3Field.setText("");
      finish = false;

      createQ();
    });

    setVisible(true);
  }

  public void createQ() {
    Random rand = new Random();
    num1 = rand.nextInt(9)+1;
    num2 = rand.nextInt(9)+1;
    num3 = rand.nextInt(9)+1;
    start = System.currentTimeMillis();
  }

  public static void main(String[] args) {
    new NumberGuessing();
  }
}
