import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxSample extends JFrame {
  public CheckboxSample() {
    setTitle("チェックボックス");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 150);

    // --- 結果表示用ラベル ---
    JLabel resultLabel = new JLabel("ここに選択内容が表示されます");

    // --- チェックボックス ---
    JCheckBox check1 = new JCheckBox("Java");
    JCheckBox check2 = new JCheckBox("Python");
    JCheckBox check3 = new JCheckBox("C++");

    // チェックボックスのイベント
    ItemListener checkListener = (new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        JCheckBox cb = (JCheckBox) e.getSource();
        // System.out.println(cb.getText() + " : " + (cb.isSelected() ? "選択" : "解除"));
        resultLabel.setText(cb.getText() + " : " + (cb.isSelected() ? "選択" : "解除"));
      }
    });
    // ItemListener checkListener = e -> {
    //   JCheckBox cb = (JCheckBox) e.getSource();
    //   // System.out.println(cb.getText() + " : " + (cb.isSelected() ? "選択" : "解除"));
    //   resultLabel.setText(cb.getText() + " : " + (cb.isSelected() ? "選択" : "解除"));
    // };
    check1.addItemListener(checkListener);
    check2.addItemListener(checkListener);
    check3.addItemListener(checkListener);

    // --- 画面に追加 ---
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    panel1.add(new JLabel("■ チェックボックス:"));
    panel1.add(check1);
    panel1.add(check2);
    panel1.add(check3);
    panel2.add(resultLabel);

    setLayout(new GridLayout(2, 1, 5, 5));
    add(panel1);
    add(panel2);

    setVisible(true);
  }

  public static void main(String[] args) {
    // SwingUtilities.invokeLater(CheckboxSample::new);
    new CheckboxSample();
  }
}
