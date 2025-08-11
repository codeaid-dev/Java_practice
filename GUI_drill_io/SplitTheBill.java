import javax.swing.*;
import java.awt.*;

public class SplitTheBill extends JFrame {
  public SplitTheBill() {
    setTitle("割り勘計算");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);

    // --- 総支払額・人数の入力 ---
    JPanel panel1 = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);
    gbc.gridx = 0; gbc.gridy = 0;
    JLabel label1 = new JLabel("支払総額:");
    label1.setFont(new Font("sans-serif", Font.PLAIN, 20));
    panel1.add(label1, gbc);
    gbc.gridx = 1; gbc.gridy = 0;
    JTextField text1 = new JTextField(10);
    text1.setFont(new Font("sans-serif", Font.PLAIN, 20));
    panel1.add(text1, gbc);

    gbc.gridx = 0; gbc.gridy = 1;
    JLabel label2 = new JLabel("人数:");
    label2.setFont(new Font("sans-serif", Font.PLAIN, 20));
    panel1.add(label2, gbc);
    gbc.gridx = 1; gbc.gridy = 1;
    JTextField text2 = new JTextField(10);
    text2.setFont(new Font("sans-serif", Font.PLAIN, 20));
    panel1.add(text2, gbc);

    // --- 端数処理選択 ---
    JPanel panel2 = new JPanel();
    JLabel label3 = new JLabel("端数処理");
    label3.setFont(new Font("sans-serif", Font.PLAIN, 20));
    panel2.add(label3);

    JPanel panel3 = new JPanel();
    JRadioButton radio1 = new JRadioButton("1人が多く支払う", true);
    JRadioButton radio2 = new JRadioButton("1人が少なく支払う");
    ButtonGroup group = new ButtonGroup();
    group.add(radio1);
    group.add(radio2);
    panel3.add(radio1);
    panel3.add(radio2);

    // --- 計算ボタン ---
    JPanel panel4 = new JPanel();
    JButton calc = new JButton("計算");
    calc.setFont(new Font("sans-serif", Font.PLAIN, 20));
    panel4.add(calc);

    // --- 総支払額・人数の入力 ---
    JPanel panel5 = new JPanel(new GridBagLayout());
    gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);
    gbc.gridx = 1; gbc.gridy = 0;
    JLabel label4 = new JLabel("人数");
    panel5.add(label4, gbc);
    gbc.gridx = 2; gbc.gridy = 0;
    JLabel label5 = new JLabel("支払額(円)");
    panel5.add(label5, gbc);
    gbc.gridx = 0; gbc.gridy = 1;
    JLabel label6 = new JLabel("参加者");
    panel5.add(label6, gbc);
    gbc.gridx = 0; gbc.gridy = 2;
    JLabel label7 = new JLabel("代表");
    panel5.add(label7, gbc);
    gbc.gridx = 0; gbc.gridy = 3;
    JLabel label8 = new JLabel("合計");
    panel5.add(label8, gbc);
    gbc.gridx = 1; gbc.gridy = 1;
    JLabel num1 = new JLabel("-");
    panel5.add(num1, gbc);
    gbc.gridx = 2; gbc.gridy = 1;
    JLabel num2 = new JLabel("-");
    panel5.add(num2, gbc);
    gbc.gridx = 1; gbc.gridy = 2;
    JLabel num3 = new JLabel("-");
    panel5.add(num3, gbc);
    gbc.gridx = 2; gbc.gridy = 2;
    JLabel num4 = new JLabel("-");
    panel5.add(num4, gbc);
    gbc.gridx = 1; gbc.gridy = 3;
    JLabel num5 = new JLabel("-");
    panel5.add(num5, gbc);
    gbc.gridx = 2; gbc.gridy = 3;
    JLabel num6 = new JLabel("-");
    panel5.add(num6, gbc);

    setLayout(new GridBagLayout());
    gbc = new GridBagConstraints();
    gbc.insets = new Insets(1, 1, 1, 1);
    gbc.gridx = 0; gbc.gridy = 0;
    add(panel1, gbc);
    gbc.gridx = 0; gbc.gridy = 1;
    add(panel2, gbc);
    gbc.gridx = 0; gbc.gridy = 2;
    add(panel3, gbc);
    gbc.gridx = 0; gbc.gridy = 3;
    add(panel4, gbc);
    gbc.gridx = 0; gbc.gridy = 4;
    add(panel5, gbc);

    calc.addActionListener(e -> {
      int total;
      int people;
      try {
        total = Integer.parseInt(text1.getText());
        people = Integer.parseInt(text2.getText());
      } catch(NumberFormatException ex) {
        total = 0;
        people = 0;
      }
      System.out.println("総支払額:"+total);
      System.out.println("人数:"+people);
      int surplus = (total/people)%100; // 100円単位で余りを出す
      num1.setText(Integer.toString(people - 1));
      num3.setText("1");
      num5.setText(Integer.toString(people));
      if (people >= 2 && total >= 200) {
        if (surplus == 0) { // 余りがない
            num2.setText(Integer.toString(total / people));
            num4.setText(Integer.toString(total / people));
        } else if (radio1.isSelected()) { // 1人が多く払う
            int price1 = total / people;
            int price2 = (price1/100)*100;
            num2.setText(Integer.toString(price2));
            num4.setText(Integer.toString(total - price2*(people-1)));
        } else { // 1人が少なく払う
            int price1 = total / people;
            int price2 = (price1/100)*100+100;
            num2.setText(Integer.toString(price2));
            num4.setText(Integer.toString(total - price2*(people-1)));
        }
        num6.setText(Integer.toString(total));
      }
    });

    setVisible(true);
  }

  public static void main(String[] args) {
    new SplitTheBill();
  }
}
