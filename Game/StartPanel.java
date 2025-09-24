import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartPanel extends JPanel implements ActionListener, KeyListener {
    boolean in_game = true;
    Dimension size;   // パネルの大きさ
    MainPanel mp;
    JButton bt;

    // コンストラクタ
    public StartPanel(Dimension size1, MainPanel mp1) {
        size = size1;
        mp   = mp1;

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
        super.paintComponent(g);   // 親クラスの描画
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

        // この Component が入力フォーカスを取得することを要求
        requestFocusInWindow();
    }

    // ボタンがクリックされたときの処理
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt) {
            // 「遊び方」の説明をダイアログに表示
            String message = "【遊び方】\n\n"
                           + "・「s」キーでゲーム開始\n"
                           + "・矢印キーで移動\n"
                           + "・スペースキーでアクション\n\n"
                           + "楽しんでください！";
            JOptionPane.showMessageDialog(this, message, "遊び方", JOptionPane.INFORMATION_MESSAGE);
            requestFocusInWindow();
        }
    }

    // キーが押されたときの処理（イベントリスナ）
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_S) { // 「s」キー
            mp.state = 1;
        }
    }
    public void keyReleased(KeyEvent ke) {}
    public void keyTyped(KeyEvent ke) {}
}
