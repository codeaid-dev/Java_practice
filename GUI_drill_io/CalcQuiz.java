import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcQuiz extends JFrame {
  String[] operators = {"＋","−","×","÷"};
  int left,right,operator;
  Timer timer;
  int count=0;
  boolean start=false;
  int correct=0, incorrect=0;
  JLabel timerLabel;
  JLabel mainLabel;
  JLabel resultLabel;
  int timeLeft = 60;

  public CalcQuiz() {
    setTitle("一桁演算クイズ");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 300);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);
  
    timerLabel = new JLabel("60");
    timerLabel.setFont(new Font("SansSerif", Font.PLAIN, 40));
    mainLabel = new JLabel("<html>表示された数字の結果となる<br>"
                             + "演算子をクリック<br>"
                             + "制限時間は60秒!<br>"
                             + "ここをクリックしてスタート</html>");
    mainLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JPanel panel = new JPanel();
    JButton additionButton = new JButton(operators[0]);
    additionButton.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JButton subtractionButton = new JButton(operators[1]);
    subtractionButton.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JButton multiplicationButton = new JButton(operators[2]);
    multiplicationButton.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JButton divisionButton = new JButton(operators[3]);
    divisionButton.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel.add(additionButton);
    panel.add(subtractionButton);
    panel.add(multiplicationButton);
    panel.add(divisionButton);
    resultLabel = new JLabel("正解数: "+correct+" 不正解数: "+incorrect);
    resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));

    gbc.gridx = 0; gbc.gridy = 0;
    add(timerLabel, gbc);
    gbc.gridx = 0; gbc.gridy = 1;
    add(mainLabel, gbc);
    gbc.gridx = 0; gbc.gridy = 2;
    add(panel, gbc);
    gbc.gridx = 0; gbc.gridy = 3;
    add(resultLabel, gbc);

    ActionListener calcListener = new ActionListener() {
      public void actionPerformed (ActionEvent evt) {
        if (!start) return;
        if (evt.getSource() == additionButton) {
          if (operator == 0) {
            correct++;
            mainLabel.setText(makeQuestion());
          } else {
            incorrect++;
          }
        }
        if (evt.getSource() == subtractionButton) {
          if (operator == 1) {
            correct++;
            mainLabel.setText(makeQuestion());
          } else {
            incorrect++;
          }
        }
        if (evt.getSource() == multiplicationButton) {
          if (operator == 2) {
            correct++;
            mainLabel.setText(makeQuestion());
          } else {
            incorrect++;
          }
        }
        if (evt.getSource() == divisionButton) {
          if (operator == 3) {
            correct++;
            mainLabel.setText(makeQuestion());
          } else {
            incorrect++;
          }
        }

        resultLabel.setText("正解数: "+correct+" 不正解数: "+incorrect);
      }
    };
    additionButton.addActionListener(calcListener);
    subtractionButton.addActionListener(calcListener);
    multiplicationButton.addActionListener(calcListener);
    divisionButton.addActionListener(calcListener);

    mainLabel.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent evt) {
        if (start) return;
        startGame();
        start = true;
      }
    });

    setVisible(true);
  }

  public String makeQuestion() {
    String result = "";
    left = (int)(Math.random() * 9)+1;
    right = (int)(Math.random() * 9)+1;
    operator = (int)(Math.random() * 4);
    if (operator == 0) { // 足し算
      // 左右とも2で(掛け算と同じになるため)、計算結果が9以下でない間繰り返す
      while ((left == 2 && right == 2) || !(left+right<=9)) {
        left = (int)(Math.random() * 8)+1;
        right = (int)(Math.random() * 9)+1-left;
      }
      result = left + " ? " + right + " = " + (left + right);
    } else if (operator == 1) { // 引き算
      // 左が4でかつ右が2で(割り算と同じになるため)、計算結果が1~9でない間繰り返す
      while ((left == 4 && right == 2) || !(0<left+right && left+right<=9)) {
        left = (int)(Math.random() * 7)+2;
        right = (int)(Math.random() * (left-1))+1;
      }
      result = left + " ? " + right + " = " + (left - right);
    } else if (operator == 2) { // 掛け算
      // 右が1でかつ左右とも2で(足し算と同じになるため)、計算結果が9以下でない間繰り返す
      while (right==1 || (left==2 && right==2) || !((left*right)<=9)) {
        left = (int)(Math.random() * 9)+1;
        right = (int)(Math.random() * 7)+2;
      }
      result = left + " ? " + right + " = " + (left * right);
    } else if (operator == 3) { // 割り算
      // 右が1でかつ(左が4でかつ右が2)で(引き算と同じになるため)、割り切れない間繰り返す
      while (right==1 || (left==4 && right==2) || !(left%right==0)) {
        left = (int)(Math.random() * 9)+1;
        right = (int)(Math.random() * 7)+2;
      }
      result = left + " ? " + right + " = " + (left / right);
    }
    return result;
  }

  public void startGame() {
    correct = 0;
    incorrect = 0;
    resultLabel.setText("正解数: "+correct+" 不正解数: "+incorrect);

    // mainLabel.setText("<html>ゲームスタート！<br>制限時間内に解答してください</html>");
    mainLabel.setText(makeQuestion());
    timeLeft = 60;
    timerLabel.setText(String.valueOf(timeLeft));

    if (timer != null && timer.isRunning()) {
      timer.stop();
    }
    timer = new Timer(1000, e -> {
      timeLeft--;
      timerLabel.setText(String.valueOf(timeLeft));
      if (timeLeft <= 0) {
        ((Timer)e.getSource()).stop();
        mainLabel.setText("<html>時間切れ！<br>もう一度クリックして再挑戦</html>");
        start = false;
      }
    });
    timer.start();
  }
  public static void main(String[] args) {
    new CalcQuiz();
  }
}
