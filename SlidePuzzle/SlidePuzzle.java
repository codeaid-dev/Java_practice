import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.Container;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class SlidePuzzle extends JFrame {
  JLabel tiles[] = new JLabel[9];

  public SlidePuzzle() {
    setTitle("スライドパズル");
    setBounds(100, 100, 320, 350);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container container = getContentPane();

    JPanel panel = new JPanel();
    for (int i=0; i<tiles.length; i++) {
      if (i==0) tiles[i] = new JLabel(" ");
      else tiles[i] = new JLabel(String.valueOf(i));
      tiles[i].setPreferredSize(new Dimension(100, 100));
      tiles[i].setBorder(new LineBorder(Color.BLACK, 1, true));
      tiles[i].setHorizontalAlignment(JLabel.CENTER);
      tiles[i].setFont(new Font("Arial", Font.PLAIN, 80));
      tiles[i].addMouseListener(new labelListener());
      panel.add(tiles[i]);
      container.add(panel, BorderLayout.CENTER);
    }
    // マス目の数字をシャッフル
    for (int i=1; i<tiles.length; i++) {
      int num = (int)(Math.random() * i);
      String tmp = tiles[i].getText();
      tiles[i].setText(tiles[num].getText());
      tiles[num].setText(tmp);
    }

    setVisible(true);
  }

  public class labelListener extends MouseAdapter {
    public void mouseClicked(MouseEvent evt) {
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
  }

  public static void main(String[] args) {
    new SlidePuzzle();
  }
}
