import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GameSample2 extends JPanel implements ActionListener, KeyListener {
  boolean in_game = true;
  Dimension size;   // パネルの大きさ
  JButton bt;

  // コンストラクタ
  public GameSample2(Dimension size1) {
    size = size1;
    setPreferredSize(size);

    // レイアウトマネージャの停止
    setLayout(null);
    // 背景色の設定
    setBackground(Color.white);

    // ボタンの配置
    Font f = new Font("SansSerif", Font.BOLD, 20);
    FontMetrics fm = getFontMetrics(f);
    String str = "遊び方";
    int w = fm.stringWidth(str) + 40;
    int h = fm.getHeight() + 10;
    bt = new JButton(str);
    bt.setFont(f);
    bt.addActionListener(this);
    bt.setSize(w, h);
    bt.setLocation(size.width/2-w/2, 5);
    add(bt);

    // キーリスナの追加
    addKeyListener(this);
    setFocusable(true);
  }

  // 描画
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    FontMetrics fm;
    Font f;
    String str1, str = "Game Title";
    int w, h;

    f    = new Font("Serif", Font.BOLD, 25);
    fm   = g.getFontMetrics(f);
    str1 = str + " (Serif)";
    w    = fm.stringWidth(str1);
    h    = fm.getHeight() + 60;
    g.setFont(f);
    g.drawString(str1, size.width/2-w/2, h);

    f    = new Font("SansSerif", Font.BOLD, 25);
    fm   = g.getFontMetrics(f);
    str1 = str + " (SansSerif)";
    w    = fm.stringWidth(str1);
    h    = h + fm.getHeight() + 5;
    g.setFont(f);
    g.drawString(str1, size.width/2-w/2, h);

    f    = new Font("Dialog", Font.BOLD, 25);
    fm   = g.getFontMetrics(f);
    str1 = str + " (Dialog)";
    w    = fm.stringWidth(str1);
    h    = h + fm.getHeight() + 5;
    g.setFont(f);
    g.drawString(str1, size.width/2-w/2, h);

    f    = new Font("DialogInput", Font.BOLD, 25);
    fm   = g.getFontMetrics(f);
    str1 = str + " (DialogInput)";
    w    = fm.stringWidth(str1);
    h    = h + fm.getHeight() + 5;
    g.setFont(f);
    g.drawString(str1, size.width/2-w/2, h);

    f    = new Font("Serif", Font.PLAIN, 20);
    fm   = g.getFontMetrics(f);
    str1 = "ゲーム開始：「 s 」キー";
    w    = fm.stringWidth(str1);
    h    = size.height - fm.getHeight() - 10;
    g.setFont(f);
    g.drawString(str1, size.width/2-w/2, h);

    // フォーカスを要求
    requestFocusInWindow();
  }

  // ボタンがクリックされたときの処理
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == bt) {
      try {
        // デフォルトブラウザで指定ページを開く
        Desktop.getDesktop().browse(new URI("https://google.com"));
        requestFocusInWindow();
      }
      catch (IOException | URISyntaxException ex) {
        ex.printStackTrace();
      }
    }
  }

  // キーが押されたときの処理
  public void keyPressed(KeyEvent ke) {
    if (ke.getKeyCode() == KeyEvent.VK_S) {  // 「s」キー
      System.out.println("Sキーが押された");
    }
  }
  public void keyReleased(KeyEvent ke) {}
  public void keyTyped(KeyEvent ke) {}

  public static void main(String[] args) {
    JFrame frame = new JFrame("サンプル2");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new GameSample2(new Dimension(500, 500)));
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
