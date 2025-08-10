import javax.swing.*;
import java.awt.*;

public class ComboBoxSample extends JFrame {
  public ComboBoxSample() {
    setTitle("プルダウンメニュー");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 150);

    // --- 結果表示用ラベル ---
    JLabel resultLabel = new JLabel("ここに選択内容が表示されます");

    // --- プルダウンメニュー（コンボボックス） ---
    String[] items = {"東京", "大阪", "福岡", "札幌"};
    JComboBox<String> combo = new JComboBox<>(items);

    combo.addActionListener(e -> {
      String selected = (String) combo.getSelectedItem();
      // System.out.println("選択された都市: " + selected);
      resultLabel.setText("選択された都市: " + selected);
    });

    // --- 画面に追加 ---
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    panel1.add(new JLabel("■ プルダウンメニュー:"));
    panel1.add(combo);
    panel2.add(resultLabel);

    setLayout(new GridLayout(2, 1, 5, 5));
    add(panel1);
    add(panel2);

    setVisible(true);
  }
  
  public static void main(String[] args) {
      // SwingUtilities.invokeLater(ComboBoxSample::new);
      new ComboBoxSample();
  }
}
