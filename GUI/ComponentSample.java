import javax.swing.*;
import java.awt.*;

public class ComponentSample extends JFrame {
  public ComponentSample() {
    setTitle("コンポーネント");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setLayout(new FlowLayout());

    // --- チェックボックス ---
    JCheckBox check1 = new JCheckBox("Java");
    JCheckBox check2 = new JCheckBox("Python");
    JCheckBox check3 = new JCheckBox("C++");

    // --- ラジオボタン ---
    JRadioButton radio1 = new JRadioButton("20代以下");
    JRadioButton radio2 = new JRadioButton("30代");
    JRadioButton radio3 = new JRadioButton("40代以上");

    ButtonGroup group = new ButtonGroup();
    group.add(radio1);
    group.add(radio2);
    group.add(radio3);

    // --- プルダウンメニュー ---
    String[] items = {"東京", "大阪", "福岡", "札幌"};
    JComboBox<String> combo = new JComboBox<>(items);

    // --- 結果表示用ラベル ---
    JLabel resultLabel = new JLabel("ここに選択内容が表示されます");

    // --- ボタン ---
    JButton showButton = new JButton("表示");
    showButton.addActionListener(e -> {
      // チェックボックスの選択内容
      StringBuilder sb = new StringBuilder();
      boolean anyCheck = false;
      if (check1.isSelected()) { sb.append("Java "); anyCheck = true; }
      if (check2.isSelected()) { sb.append("Python "); anyCheck = true; }
      if (check3.isSelected()) { sb.append("C++ "); anyCheck = true; }
      if (!anyCheck) sb.append("なし");

      // ラジオボタンの選択内容
      sb.append(" | ");
      if (radio1.isSelected()) sb.append("20代以下");
      else if (radio2.isSelected()) sb.append("30代");
      else if (radio3.isSelected()) sb.append("40代以上");
      else sb.append("未選択");

      // プルダウンメニューの選択内容
      sb.append(" | ");
      sb.append(combo.getSelectedItem());

      // ラベルに反映
      resultLabel.setText(sb.toString());
    });

    // --- 画面に追加 ---
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    panel1.add(new JLabel("■ チェックボックス:"));
    panel1.add(check1);
    panel1.add(check2);
    panel1.add(check3);

    panel2.add(new JLabel("■ ラジオボタン:"));
    panel2.add(radio1);
    panel2.add(radio2);
    panel2.add(radio3);

    panel3.add(new JLabel("■ プルダウンメニュー:"));
    panel3.add(combo);

    panel3.add(showButton);
    panel4.add(resultLabel);

    setLayout(new GridLayout(4, 1, 5, 5));
    add(panel1);
    add(panel2);
    add(panel3);
    add(panel4);

    setVisible(true);
  }

  public static void main(String[] args) {
    // SwingUtilities.invokeLater(ComponentSample::new);
    new ComponentSample();
  }
}
