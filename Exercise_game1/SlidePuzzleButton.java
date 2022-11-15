import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class SlidePuzzleButton extends JFrame implements ActionListener {
  JButton tiles[] = new JButton[9];

  public SlidePuzzleButton() {
    setTitle("スライドパズル(ボタン)");
    setBounds(100, 100, 320, 350);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container container = getContentPane();


    JPanel panel = new JPanel();
    for (int i=0; i<tiles.length; i++) {
      if (i==0) tiles[i] = new JButton(" ");
      else tiles[i] = new JButton(String.valueOf(i));
      tiles[i].setPreferredSize(new Dimension(100, 100));
      //tiles[i].setBorder(new LineBorder(Color.BLACK, 1, true));
      tiles[i].setHorizontalAlignment(JButton.CENTER);
      tiles[i].setFont(new Font("Arial", Font.PLAIN, 80));
      tiles[i].setFocusPainted(false);
      tiles[i].addActionListener(this);
      panel.add(tiles[i]);
    }
    container.add(panel, BorderLayout.CENTER);
    // マス目の数字をシャッフル
    for (int i=1; i<tiles.length; i++) {
      int num = (int)(Math.random() * i);
      String tmp = tiles[i].getText();
      tiles[i].setText(tiles[num].getText());
      tiles[num].setText(tmp);
    }

    setVisible(true);
  }

  public void actionPerformed(ActionEvent evt) {
    for (int i=0; i<tiles.length; i++) {
      if (evt.getSource() == tiles[i]) {
        if (i <= 5 && tiles[i+3].getText() == " ") { //下と入れ替え
          String tmp = tiles[i].getText();
          tiles[i].setText(tiles[i+3].getText());
          tiles[i+3].setText(tmp);
        } else if (i >= 3 && tiles[i-3].getText() == " ") { //上と入れ替え
          String tmp = tiles[i].getText();
          tiles[i].setText(tiles[i-3].getText());
          tiles[i-3].setText(tmp);
        } else if (i %3 != 2 && tiles[i+1].getText() == " ") { //右と入れ替え
          String tmp = tiles[i].getText();
          tiles[i].setText(tiles[i+1].getText());
          tiles[i+1].setText(tmp);
        } else if (i % 3 != 0 && tiles[i-1].getText() == " ") { //左と入れ替え
          String tmp = tiles[i].getText();
          tiles[i].setText(tiles[i-1].getText());
          tiles[i-1].setText(tmp);
        }
      }
    }
  }

  public static void main(String[] args) {
    new SlidePuzzleButton();
  }
}
