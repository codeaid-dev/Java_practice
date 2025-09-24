import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// ゲームの状態を管理するメインパネル
class MainPanel extends JPanel {
    int state = 0; // 0=タイトル画面, 1=ゲーム画面

    public MainPanel(Dimension size) {
        setPreferredSize(size);
        setBackground(Color.black);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        if (state == 0) {
            g.drawString("ここにゲーム画面が表示されます (state=0)", 20, 20);
        } else if (state == 1) {
            g.drawString("ゲーム開始！ (state=1)", 20, 20);
        }
    }
}

// タイトル画面（StartPanel）
class StartPanel extends JPanel implements ActionListener, KeyListener {
    Dimension size;   // パネルの大きさ
    MainPanel mp;
    JButton bt;

    public StartPanel(Dimension size1, MainPanel mp1) {
        size = size1;
        mp   = mp1;

        setLayout(null);
        setBackground(Color.white);

        // ボタン作成
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

        addKeyListener(this);
        setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        String str = "Game Title";
        g.setFont(new Font("Serif", Font.BOLD, 30));
        g.drawString(str, size.width/2 - 100, size.height/2 - 50);

        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.drawString("ゲーム開始：「s」キー", size.width/2 - 100, size.height - 50);

        requestFocusInWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt) {
            String message = "【遊び方】\n\n"
                           + "・「s」キーでゲーム開始\n"
                           + "・矢印キーで移動\n"
                           + "・スペースキーでアクション\n\n"
                           + "楽しんでください！";
            JOptionPane.showMessageDialog(this, message, "遊び方", JOptionPane.INFORMATION_MESSAGE);
            requestFocusInWindow();
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_S) {
            mp.state = 1; // ゲーム開始に切り替え
            mp.repaint();
        }
    }
    public void keyReleased(KeyEvent ke) {}
    public void keyTyped(KeyEvent ke) {}
}

// 実行用クラス
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Dimension size = new Dimension(500, 400);

            JFrame frame = new JFrame("ゲーム サンプル");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            MainPanel mp = new MainPanel(size);
            StartPanel sp = new StartPanel(size, mp);

            // タブで画面を切り替えできるようにする（サンプル用）
            JTabbedPane tabs = new JTabbedPane();
            tabs.addTab("タイトル画面", sp);
            tabs.addTab("ゲーム画面", mp);

            frame.add(tabs);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
