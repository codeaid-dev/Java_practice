import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleCalculator {
  public static void main(String[] args) {
    JFrame frame = new JFrame("足し算電卓");
    JTextField field1 = new JTextField(5);
    JTextField field2 = new JTextField(5);
    JButton addButton = new JButton("足す");
    JLabel resultLabel = new JLabel("結果: ");

    // addButton.addActionListener(new ActionListener() {
    //   public void actionPerformed(ActionEvent e) {
    //     try {
    //       int a = Integer.parseInt(field1.getText());
    //       int b = Integer.parseInt(field2.getText());
    //       resultLabel.setText("結果: " + (a + b));
    //     } catch (NumberFormatException ex) {
    //       resultLabel.setText("数値を入力してください");
    //     }
    //   }
    // });
    addButton.addActionListener(e -> {
      try {
        int a = Integer.parseInt(field1.getText());
        int b = Integer.parseInt(field2.getText());
        resultLabel.setText("結果: " + (a + b));
      } catch (NumberFormatException ex) {
        resultLabel.setText("数値を入力してください");
      }
    });

    JPanel panel = new JPanel();
    panel.add(new JLabel("数値1:"));
    panel.add(field1);
    panel.add(new JLabel("数値2:"));
    panel.add(field2);
    panel.add(addButton);
    panel.add(resultLabel);

    frame.add(panel);
    frame.setSize(400, 120);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
