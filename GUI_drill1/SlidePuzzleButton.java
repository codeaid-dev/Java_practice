import javax.swing.*;
import java.awt.*;

public class SlidePuzzleButton {
  private static final int SIZE = 3;
  private final JButton[] tiles = new JButton[SIZE * SIZE];
  private final JFrame frame;

  public SlidePuzzleButton() {
    frame = new JFrame("スライドパズル(ボタン)");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(320, 350);

    JPanel panel = new JPanel(new GridLayout(SIZE, SIZE));

    for (int i = 0; i < tiles.length; i++) {
      String label = (i == 0) ? " " : String.valueOf(i);
      JButton button = new JButton(label);
      button.setFont(new Font("Arial", Font.PLAIN, 80));
      button.setFocusPainted(false);
      button.setHorizontalAlignment(SwingConstants.CENTER);
      int index = i; // ラムダ式内で使用するため
      button.addActionListener(e -> handleClick(index));
      tiles[i] = button;
      panel.add(button);
    }

    frame.add(panel, BorderLayout.CENTER);
    shuffleTiles();
    frame.setVisible(true);
  }

  private void shuffleTiles() {
    for (int i = 1; i < tiles.length; i++) {
      int j = (int)(Math.random() * i);
      String tmp = tiles[i].getText();
      tiles[i].setText(tiles[j].getText());
      tiles[j].setText(tmp);
    }
  }

  private void handleClick(int i) {
    if (i + SIZE < tiles.length && tiles[i + SIZE].getText().equals(" ")) {
      swapTiles(i, i + SIZE); // 下
    } else if (i - SIZE >= 0 && tiles[i - SIZE].getText().equals(" ")) {
      swapTiles(i, i - SIZE); // 上
    } else if (i % SIZE < SIZE - 1 && tiles[i + 1].getText().equals(" ")) {
      swapTiles(i, i + 1); // 右
    } else if (i % SIZE > 0 && tiles[i - 1].getText().equals(" ")) {
      swapTiles(i, i - 1); // 左
    }
  }

  private void swapTiles(int i, int j) {
    String tmp = tiles[i].getText();
    tiles[i].setText(tiles[j].getText());
    tiles[j].setText(tmp);
  }

  public static void main(String[] args) {
    new SlidePuzzleButton();
    //SwingUtilities.invokeLater(SlidePuzzleButton::new);
  }
}
