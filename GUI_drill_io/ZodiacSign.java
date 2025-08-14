import javax.swing.*;
import java.awt.*;

public class ZodiacSign extends JFrame {
  String[] seiza = {"山羊座","水瓶座","魚座","牡羊座","牡牛座","双子座","蟹座","獅子座","乙女座","天秤座","蠍座","射手座"};
  int[] endDate = {19,18,20,19,20,21,22,22,22,23,22,21};
  Integer[] month = new Integer[12];
  Integer[] date = new Integer[31];

  public ZodiacSign() {
    setTitle("あなたの星座");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 200);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);

    for (int i = 1; i <= 12; i++) { month[i-1]=i; }
    for (int i = 0; i < 31; i++) { date[i]=i+1; }

    JPanel panel = new JPanel();
    JComboBox<Integer> monthComboBox = new JComboBox<>(month);
    JComboBox<Integer> dateComboBox = new JComboBox<>(date);
    JLabel monthLabel = new JLabel("月");
    JLabel dateLabel = new JLabel("日");
    JButton showButton = new JButton("表示");
    panel.add(monthComboBox);
    panel.add(monthLabel);
    panel.add(dateComboBox);
    panel.add(dateLabel);
    panel.add(showButton);

    JLabel resultLabel = new JLabel("ここに結果を表示");
    resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
    gbc.gridx = 0; gbc.gridy = 0;
    add(panel, gbc);
    gbc.gridx = 0; gbc.gridy = 1;
    add(resultLabel, gbc);

    showButton.addActionListener(e -> {
      int m = (int)monthComboBox.getSelectedItem();
      int d = (int)dateComboBox.getSelectedItem();
      if (m == 2 && d >=29) {
        d = 29;
      } else if ((m == 4 || m == 6 || m == 9 || m == 11)
              && d >= 31) {
        d = 30;
      }
      if (endDate[m-1] >= d) {
        resultLabel.setText(m+"月"+d+"日は"+seiza[m-1]+"です");
      } else {
        resultLabel.setText(m+"月"+d+"日は"+seiza[m%12]+"です");
      }
    });

    setVisible(true);
  }

  public static void main(String[] args) {
    new ZodiacSign();
  }
}
