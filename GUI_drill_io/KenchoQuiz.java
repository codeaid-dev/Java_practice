import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Random;

public class KenchoQuiz extends JFrame {
  String[] prefectures;
  String[] cities;
  int questionID;

  public KenchoQuiz() {
    setTitle("県庁所在地クイズ");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 300);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);

    // --- CSVファイルの読み込み ---
    String line;
    int lineNumber = 0;
    try (BufferedReader br = new BufferedReader(new FileReader("kencho.csv"))) {
      while ((line = br.readLine()) != null) {
        lineNumber++;
        if (lineNumber == 1) {
          prefectures = line.split(",");
        } else if (lineNumber == 2) {
          cities = line.split(",");
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    JPanel panel1 = new JPanel();
    JLabel questionLabel1 = new JLabel("問題: ");
    questionLabel1.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JLabel questionLabel2 = new JLabel(createQ());
    questionLabel2.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel1.add(questionLabel1);
    panel1.add(questionLabel2);

    JPanel panel2 = new JPanel();
    JLabel answerLabel = new JLabel("答え: ");
    answerLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JTextField answerField = new JTextField(10);
    answerField.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel2.add(answerLabel);
    panel2.add(answerField);

    JButton showButton = new JButton("解答");
    showButton.setFont(new Font("SansSerif", Font.PLAIN, 20));

    JButton otherButton = new JButton("別の問題");
    otherButton.setFont(new Font("SansSerif", Font.PLAIN, 20));

    JLabel resultLabel = new JLabel("ここに結果を表示");
    resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));

    gbc.gridx = 0; gbc.gridy = 0;
    add(panel1, gbc);
    gbc.gridx = 0; gbc.gridy = 1;
    add(panel2, gbc);
    gbc.gridx = 0; gbc.gridy = 2;
    add(showButton, gbc);
    gbc.gridx = 0; gbc.gridy = 3;
    add(otherButton, gbc);
    gbc.gridx = 0; gbc.gridy = 4;
    add(resultLabel, gbc);

    showButton.addActionListener(e -> {
      String answer = answerField.getText();
      if (answer.equals(cities[questionID])) {
        resultLabel.setText("正解！！");
      } else {
        resultLabel.setText("不正解（正解："+cities[questionID]+"）");
      }
    });

    otherButton.addActionListener(e -> {
      questionLabel2.setText(createQ());
    });

    setVisible(true);
  }

  public String createQ() {
    Random rand = new Random();
    questionID = rand.nextInt(prefectures.length);
    return prefectures[questionID]+"の県庁所在地は？";
  }

  public static void main(String[] args) {
    new KenchoQuiz();
  }
}
