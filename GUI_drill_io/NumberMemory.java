import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class NumberMemory extends JFrame {
  Timer timer;
  int count=0;
  boolean start=false;
  int level = 1;
  String number;

  public NumberMemory() {
    setTitle("数字記憶");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 300);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);

    JLabel mainLabel = new JLabel("数字記憶を開始します！");
    mainLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JLabel numberLabel = new JLabel();
    numberLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));

    JPanel panel = new JPanel();
    JTextField answerField = new JTextField(10);
    answerField.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JButton answerButton = new JButton("解答");
    answerButton.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel.add(answerField);
    panel.add(answerButton);

    JLabel resultLabel = new JLabel("ここに結果を表示");
    resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));

    JButton startButton = new JButton("スタート・リセット");
    startButton.setFont(new Font("SansSerif", Font.PLAIN, 20));

    gbc.gridx = 0; gbc.gridy = 0;
    add(mainLabel, gbc);
    gbc.gridx = 0; gbc.gridy = 1;
    add(numberLabel, gbc);
    gbc.gridx = 0; gbc.gridy = 2;
    add(panel, gbc);
    gbc.gridx = 0; gbc.gridy = 3;
    add(resultLabel, gbc);
    gbc.gridx = 0; gbc.gridy = 4;
    add(startButton, gbc);

    answerButton.addActionListener(e -> {
      answerField.setEnabled(false);
      answerButton.setEnabled(false);
      String ans = answerField.getText();
      if (ans.equals(number)) {
        resultLabel.setForeground(Color.BLACK);
        resultLabel.setText("正解！次のレベルへ進みます。");
        level++;
        mainLabel.setText(level+"桁の数字を覚えてください");
        number += new Random().nextInt(10);
        numberLabel.setText(number);
        timer.start();
      } else {
        resultLabel.setForeground(Color.RED);
        resultLabel.setText("間違い！(正解："+number+")あなたのレベル："+(level-1));
        timer.stop();
      }
    });

    startButton.addActionListener(e -> {
      resultLabel.setForeground(Color.BLACK);
      resultLabel.setText("ここに結果を表示");
      number = "" + new Random().nextInt(10);
      level = 1;
      mainLabel.setText(level+"桁の数字を覚えてください");
      numberLabel.setText(number);
      answerField.setText("");
      answerField.setEnabled(false);
      answerButton.setEnabled(false);
      timer.start();
    });

    timer = new Timer(3000, e -> {
      numberLabel.setText("覚えた数字を入力してください");
      answerField.setText("");
      answerField.setEnabled(true);
      answerButton.setEnabled(true);
      timer.stop();
    });

    setVisible(true);
  }

  public static void main(String[] args) {
    new NumberMemory();
  }
}
