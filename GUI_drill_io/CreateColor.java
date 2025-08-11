import javax.swing.*;
import java.awt.*;

public class CreateColor extends JFrame {
  public CreateColor() {
    setTitle("選択した色を表示");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 150);

    JCheckBox check1 = new JCheckBox("赤");
    JCheckBox check2 = new JCheckBox("緑");
    JCheckBox check3 = new JCheckBox("青");

    JLabel resultLabel = new JLabel("ここに表示");

    JButton showButton = new JButton("表示");
    showButton.addActionListener(e -> {
      String s = "";
      boolean red = false, green = false, blue = false;
      if (check1.isSelected()) { red = true; }
      if (check2.isSelected()) { green = true; }
      if (check3.isSelected()) { blue = true; }
      if (red && !green && !blue) { s = "赤"; }
      if (!red && green && !blue) { s = "緑"; }
      if (!red && !green && blue) { s = "青"; }
      if (red && green && !blue) { s = "黄"; }
      if (red && !green && blue) { s = "マゼンタ"; }
      if (!red && green && blue) { s = "シアン"; }
      if (red && green && blue) { s = "白"; }
      if (!red && !green && !blue) { s = "黒"; }

      resultLabel.setText(s);
    });

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();

    panel1.add(check1);
    panel1.add(check2);
    panel1.add(check3);

    panel2.add(showButton);
    panel3.add(resultLabel);

    setLayout(new GridLayout(3, 1, 5, 5));
    add(panel1);
    add(panel2);
    add(panel3);

    setVisible(true);
  }

  public static void main(String[] args) {
    new CreateColor();
  }
}
