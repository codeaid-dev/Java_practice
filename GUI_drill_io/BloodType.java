import javax.swing.*;
import java.awt.*;
import java.util.Set;
import java.util.LinkedHashSet;

public class BloodType extends JFrame {
  String[] genotype = {"AA","AO","BB","BO","AB","OO"};

  public BloodType() {
    setTitle("血液型");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 200);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);

    JPanel panel = new JPanel();
    JComboBox<String> motherComboBox = new JComboBox<>(genotype);
    JComboBox<String> fatherComboBox = new JComboBox<>(genotype);
    JLabel motherLabel = new JLabel("母親の遺伝子型: ");
    JLabel fatherLabel = new JLabel("父親の遺伝子型: ");
    panel.add(motherLabel);
    panel.add(motherComboBox);
    panel.add(fatherLabel);
    panel.add(fatherComboBox);

    JButton showButton = new JButton("表示");
    showButton.setFont(new Font("SansSerif", Font.PLAIN, 20));

    JLabel resultLabel = new JLabel("ここに結果を表示");
    resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
    gbc.gridx = 0; gbc.gridy = 0;
    add(panel, gbc);
    gbc.gridx = 0; gbc.gridy = 1;
    add(showButton, gbc);
    gbc.gridx = 0; gbc.gridy = 2;
    add(resultLabel, gbc);

    showButton.addActionListener(e -> {
      String motherStr = (String)motherComboBox.getSelectedItem();
      String[] motherArr = motherStr.split("");
      String fatherStr = (String)fatherComboBox.getSelectedItem();
      String[] fatherArr = fatherStr.split("");
      String[] result = new String[4];
      int i=0;
      for (String m : motherArr) {
        for (String f : fatherArr) {
          result[i] = m+f;
          i++;
        }
      }
      Set<String> childSet = new LinkedHashSet<>();
      for (String child : result) {
        if (child.equals("AA") || child.equals("AO") || child.equals("OA")) {
          childSet.add("A型");
        } else if (child.equals("BB") || child.equals("BO") || child.equals("OB")) {
          childSet.add("B型");
        } else if (child.equals("OO")) {
          childSet.add("O型");
        } else {
          childSet.add("AB型");
        }
      }
      String resultStr = String.join("と", childSet);
      resultLabel.setText("子の血液型は"+resultStr+"の可能性があります。");
    });

    setVisible(true);
  }

  public static void main(String[] args) {
    new BloodType();
  }
}
