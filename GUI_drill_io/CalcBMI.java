import javax.swing.*;
import java.awt.*;

public class CalcBMI extends JFrame {
  public CalcBMI() {
    setTitle("あなたのBMI値");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 250);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);

    JPanel panel1 = new JPanel();
    JLabel heightLabel = new JLabel("身長(cm): ");
    heightLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JTextField heightField = new JTextField(10);
    heightField.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel1.add(heightLabel);
    panel1.add(heightField);

    JPanel panel2 = new JPanel();
    JLabel weightLabel = new JLabel("体重(kg): ");
    weightLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JTextField weightField = new JTextField(10);
    weightField.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel2.add(weightLabel);
    panel2.add(weightField);

    JButton showButton = new JButton("測定");
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
        double height = Double.parseDouble(heightField.getText());
        double weight = Double.parseDouble(weightField.getText());
        if (height <= 0 || weight <= 0) {
          throw new ArithmeticException();
        }
        double bmi = weight / ((height/100)*(height/100));
        System.out.println("bmi:"+bmi+" weight:"+weight+" height:"+height);
        String result;
        if (bmi < 16) { result = "痩せすぎ"; }
        else if (16.0 <= bmi && bmi <= 16.99) { result = "痩せ"; }
        else if (17.0 <= bmi && bmi <= 18.49) { result = "痩せぎみ"; }
        else if (18.50 <= bmi && bmi <= 24.99) { result = "普通体重"; }
        else if (25.0 <= bmi && bmi <= 29.99) { result = "前肥満"; }
        else if (30.0 <= bmi && bmi <= 34.99) { result = "肥満(1度)"; }
        else if (35.0 <= bmi && bmi <= 39.99) { result = "肥満(2度)"; }
        else { result = "肥満(3度)"; }
        resultLabel.setForeground(Color.BLACK);
        resultLabel.setText(String.format("BMI値: %.2f 判定: %sです。", bmi, result));
        // bmi = (double)((int)(bmi*100))/100;
        // resultLabel.setText(String.format("BMI値: "+bmi+" 判定: "+result+"です。"));
      } catch(NumberFormatException | ArithmeticException ex) {
        resultLabel.setForeground(Color.RED);
        resultLabel.setText("有効な数値を入力してください。");
      }
    });

    setVisible(true);
  }

  public static void main(String[] args) {
    new CalcBMI();
  }
}
