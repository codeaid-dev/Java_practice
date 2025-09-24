import java.awt.*;
import javax.swing.*;

// import start.*;
// import game.*;
// import clear.*;
// import over.*;

public class MainPanel extends JPanel implements Runnable {
  Dimension size;   // パネルの大きさ
  boolean in_game = true;   // ゲーム実行中はtrue
  public int state = 0;   // ゲーム状態（0:表紙，1:ゲーム，2:クリア，3:オーバー，4:終了）
  public int level = 1;   // ゲームレベル
  int old_state = 0;   // 直前のゲーム状態
  StartPanel sp;
  GamePanel gp;
  GameClearPanel gcp;
  GameOverPanel gop;
  Thread td;

  // コンストラクタ
  public MainPanel(Dimension size1) {
    size = size1;

    // グリッドレイアウト
    setLayout(new GridLayout(1, 1, 0, 0));

    // ゲームパネルの生成（スタート）
    sp = new StartPanel(size, this);
    add(sp);

    // スレッドの生成
    td = new Thread(this);
    td.start();
  }

  // ゲームの状態を変更
  public void run() {
    while (in_game) {
      try {
        Thread.sleep(100);   // 100 ms 毎に実施
      }
      catch (InterruptedException e) {}

      if (state != old_state) {
        // 前のパネルの削除
        if (old_state == 0)      remove(sp);
        else if (old_state == 1) remove(gp);
        else if (old_state == 2) remove(gcp);
        else                     remove(gop);

        // 新しいパネルの追加
        if (state == 4) {   // ゲーム終了
          in_game = false;
        } else {
          if (state == 0) {   // StartPanel
            sp = new StartPanel(size, this);
            add(sp);
          } else if (state == 1) {   // GamePanel
            gp = new GamePanel(size, this);
            add(gp);
          } else if (state == 2) {   // GameClearPanel
            gcp = new GameClearPanel(size, this);
            add(gcp);
          } else {   // GameOverPanel
            gop = new GameOverPanel(size, this);
            add(gop);
          }
          validate();
          old_state = state;
        }
      }
    }
  }

  public static void main(String[] args) {
    new MainPanel(new Dimension(500, 500));
  }
}
