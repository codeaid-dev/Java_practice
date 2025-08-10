import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonSample extends JFrame {
  public RadioButtonSample() {
    setTitle("ラジオボタン");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 150);

    // --- 結果表示用ラベル ---
    JLabel resultLabel = new JLabel("ここに選択内容が表示されます");

    // --- ラジオボタン ---
    JRadioButton radio1 = new JRadioButton("20代以下");
    JRadioButton radio2 = new JRadioButton("30代");
    JRadioButton radio3 = new JRadioButton("40代以上");

    // グループ化（1つだけ選択可）
    ButtonGroup group = new ButtonGroup();
    group.add(radio1);
    group.add(radio2);
    group.add(radio3);

    // ラジオボタンのイベント
    // ActionListener radioListener = (new ActionListener() {
    //   public void actionPerformed(ActionEvent e) {
    //     JRadioButton rb = (JRadioButton) e.getSource();
    //     // System.out.println("選択された年代: " + rb.getText());
    //     resultLabel.setText("選択された年代: " + rb.getText());
    //   }
    // });
    ActionListener radioListener = e -> {
      JRadioButton rb = (JRadioButton) e.getSource();
      // System.out.println("選択された年代: " + rb.getText());
      resultLabel.setText("選択された年代: " + rb.getText());
    };
    radio1.addActionListener(radioListener);
    radio2.addActionListener(radioListener);
    radio3.addActionListener(radioListener);

    // --- 画面に追加 ---
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    panel1.add(new JLabel("■ ラジオボタン:"));
    panel1.add(radio1);
    panel1.add(radio2);
    panel1.add(radio3);
    panel2.add(resultLabel);

    setLayout(new GridLayout(2, 1, 5, 5));
    add(panel1);
    add(panel2);

    setVisible(true);
  }

  public static void main(String[] args) {
    // SwingUtilities.invokeLater(RadioButtonSample::new);
    new RadioButtonSample();
  }
}
