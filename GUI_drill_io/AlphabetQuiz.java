import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AlphabetQuiz extends JFrame {
  String seikai = "";
  long start, spend;
  boolean finish = false;

  public AlphabetQuiz() {
    setTitle("アルファベットクイズ");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 300);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);

    gbc.gridx = 0; gbc.gridy = 0;
    JLabel label = new JLabel("抜けているアルファベットは？");
    label.setFont(new Font("SansSerif", Font.PLAIN, 20));
    add(label, gbc);

    // --- 問題の表示 ---
    gbc.gridx = 0; gbc.gridy = 1;
    JLabel questionLabel = new JLabel();
    questionLabel.setFont(new Font("SansSerif", Font.PLAIN, 24));
    questionLabel.setText(createQ());
    add(questionLabel, gbc);

    // --- 答えの入力 ---
    gbc.gridx = 0; gbc.gridy = 2;
    JPanel panel = new JPanel();
    JTextField ansField = new JTextField(5);
    ansField.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel.add(ansField);
    JButton ansButton = new JButton("解答");
    ansButton.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel.add(ansButton);
    add(panel, gbc);

    // --- 結果の表示 ---
    gbc.gridx = 0; gbc.gridy = 3;
    JLabel resultLabel = new JLabel("ここに結果を表示");
    resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
    add(resultLabel, gbc);

    // --- 別の問題を表示 ---
    gbc.gridx = 0; gbc.gridy = 4;
    JButton otherButton = new JButton("別の問題");
    otherButton.setFont(new Font("SansSerif", Font.PLAIN, 20));
    add(otherButton, gbc);

    ansButton.addActionListener(e -> {
      if (judgeA(seikai, ansField.getText())) {
        if (!finish) {
          spend = (System.currentTimeMillis() - start) / 1000;
          finish = true;
        }
        resultLabel.setText("正解です。経過時間: "+spend+"秒");
      } else {
        resultLabel.setText("不正解です。正解は（"+seikai+"）");
      }
    });

    otherButton.addActionListener(e -> {
      finish = false;
      resultLabel.setText("ここに結果を表示");
      ansField.setText("");
      questionLabel.setText(createQ());
    });

    setVisible(true);
  }

  public String createQ() {
    String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String[] alphabet = str.split("");
    Random rand = new Random();
    int hide = rand.nextInt(alphabet.length);
    seikai = alphabet[hide];
    String question = "";
    for (int i=0; i<alphabet.length; i++) {
      if (i != hide) {
        question += alphabet[i];
      }
    }
    start = System.currentTimeMillis();
    return question;
  }

  public boolean judgeA(String str1, String str2) {
    return str1.equalsIgnoreCase(str2);
  }

  public static void main(String[] args) {
    new AlphabetQuiz();
  }
}
