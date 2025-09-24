import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener, Runnable {
  Dimension size;
  MainPanel mp;
  JButton bt1, bt2;
  Random rand;
  Thread td;
  boolean in_game = true;
  int x[], y[];   // 円の位置

  // コンストラクタ
  public GamePanel(Dimension size1, MainPanel mp1) {
    size = size1;
    mp   = mp1;

    // レイアウトマネージャの停止
    setLayout(null);

    // ボタンの配置
    Font f = new Font("SansSerif", Font.BOLD, 20);
    FontMetrics fm = getFontMetrics(f);

    String str1 = "ゲームクリア";
    int w1 = fm.stringWidth(str1) + 40;
    int h1 = fm.getHeight() + 10;
    bt1 = new JButton(str1);
    bt1.setFont(f);
    bt1.addActionListener(this);
    bt1.setSize(w1, h1);

    String str2 = "ゲームオーバー";
    int w2 = fm.stringWidth(str2) + 40;
    int h2 = fm.getHeight() + 10;
    bt2 = new JButton(str2);
    bt2.setFont(f);
    bt2.addActionListener(this);
    bt2.setSize(w2, h2);

    int w = size.width / 2 - (w1 + w2 + 5) / 2;
    bt1.setLocation(w, size.height-h1-20);
    add(bt1);
    bt2.setLocation(w+w1+5, size.height-h1-20);
    add(bt2);

    // ランダム変数の初期化，初期位置の決定
    rand = new Random();
    x    = new int [3];
    y    = new int [3];
    for (int i1 = 0; i1 < 3; i1++) {
      x[i1] = rand.nextInt(size.width - 40);
      y[i1] = rand.nextInt(size.height - 40);
    }

    // スレッドの生成
    td = new Thread(this);
    td.start();
  }

  // スレッドの実行
  public void run() {
    while (in_game) {
      try {
        if (mp.level == 1)      Thread.sleep(500);
        else if (mp.level == 2) Thread.sleep(100);
        else                    Thread.sleep(20);
      }
      catch (InterruptedException e) {}
      for (int i1 = 0; i1 < 3; i1++) {
        x[i1] = rand.nextInt(size.width - 40);
        y[i1] = rand.nextInt(size.height - 40);
      }
      repaint();
    }
  }

  // 描画
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // 背景色をレベルごとに変える（画像の代わり）
    if (mp.level == 1)      setBackground(Color.lightGray);
    else if (mp.level == 2) setBackground(Color.cyan);
    else                    setBackground(Color.pink);

    // ランダムに動く円
    for (int i1 = 0; i1 < 3; i1++) {
      if (i1 == 0)      g.setColor(Color.red);
      else if (i1 == 1) g.setColor(Color.green);
      else              g.setColor(Color.gray);
      g.fillOval(x[i1], y[i1], 40, 40);
    }
  }

  // ボタンがクリックされたときの処理
  public void actionPerformed(ActionEvent e) {
    in_game = false;
    if (e.getSource() == bt1)   // ゲームクリア
      mp.state = 2;
    else   // ゲームオーバー
      mp.state = 3;
  }
}
