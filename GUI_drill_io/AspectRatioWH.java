import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AspectRatioWH extends JFrame {
  public AspectRatioWH() {
    setTitle("アスペクト比(幅・高さの算出)");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 300);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);

    // --- アスペクト比の入力 ---
    JPanel panel1 = new JPanel();
    JLabel aspectLabel = new JLabel("アスペクト比: ");
    aspectLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JTextField aspectField = new JTextField(5);
    aspectField.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel1.add(aspectLabel);
    panel1.add(aspectField);

    // --- 幅もしくは高さの選択と入力 ---
    JPanel panel2 = new JPanel();
    JRadioButton radio1 = new JRadioButton("幅: ", true);
    radio1.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JTextField widthField = new JTextField(5);
    widthField.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JRadioButton radio2 = new JRadioButton("高さ: ");
    radio2.setFont(new Font("SansSerif", Font.PLAIN, 20));
    JTextField heightField = new JTextField(5);
    heightField.setEditable(false);
    heightField.setFont(new Font("SansSerif", Font.PLAIN, 20));
    panel2.add(radio1);
    panel2.add(widthField);
    panel2.add(radio2);
    panel2.add(heightField);
    ButtonGroup group = new ButtonGroup();
    group.add(radio1);
    group.add(radio2);
    ActionListener radioListener = e -> {
      JRadioButton rb = (JRadioButton) e.getSource();
      if (rb == radio1) {
        widthField.setEditable(true);
        heightField.setEditable(false);
      } else {
        widthField.setEditable(false);
        heightField.setEditable(true);
      }
    };
    radio1.addActionListener(radioListener);
    radio2.addActionListener(radioListener);

    JButton showButton = new JButton("計算");
    showButton.setFont(new Font("SansSerif", Font.PLAIN, 20));

    // --- エラーの表示 ---
    JLabel errorLabel = new JLabel();
    errorLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
    errorLabel.setForeground(Color.RED);

    gbc.gridx = 0; gbc.gridy = 0;
    add(panel1, gbc);
    gbc.gridx = 0; gbc.gridy = 1;
    add(panel2, gbc);
    gbc.gridx = 0; gbc.gridy = 2;
    add(showButton, gbc);
    gbc.gridx = 0; gbc.gridy = 3;
    add(errorLabel, gbc);

    showButton.addActionListener(e -> {
      String[] aspect = aspectField.getText().split(":");
      if (aspect.length != 2) {
        errorLabel.setText("有効なアスペクト比を入力してください。");
        return;
      }
      int aspectW, aspectH;
      try {
        aspectW = Integer.parseInt(aspect[0]);
        aspectH = Integer.parseInt(aspect[1]);
      } catch(NumberFormatException ex) {
        errorLabel.setText("アスペクト比は整数で入力してください。");
        return;
      }
      if (radio1.isSelected()) {
        try {
          int width = Integer.parseInt(widthField.getText());
          heightField.setText(String.valueOf((int)(width*(double)aspectH/aspectW)));
          errorLabel.setText("");
        } catch(NumberFormatException ex) {
          errorLabel.setText("幅に有効な整数を入力してください。");
        }
      } else if (radio2.isSelected()) {
        try {
          int height = Integer.parseInt(heightField.getText());
          widthField.setText(String.valueOf((int)(height*(double)aspectW/aspectH)));
          errorLabel.setText("");
        } catch(NumberFormatException ex) {
          errorLabel.setText("高さに有効な整数を入力してください。");
        }
      }
    });

    setVisible(true);
  }

  public static void main(String[] args) {
    new AspectRatioWH();
  }
}
