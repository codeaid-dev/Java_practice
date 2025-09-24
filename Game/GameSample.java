import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

// ==================== MainPanel ====================
class MainPanel extends JPanel implements Runnable {
    Dimension size;
    boolean in_game = true;
    public int state = 0;   // 0:タイトル, 1:ゲーム, 2:クリア, 3:オーバー, 4:終了
    public int level = 1;
    int old_state = -1;

    StartPanel sp;
    GamePanel gp;
    GameClearPanel gcp;
    GameOverPanel gop;

    Thread td;

    public MainPanel(Dimension size1) {
        size = size1;
        setLayout(new BorderLayout());
        sp = new StartPanel(size, this);
        add(sp, BorderLayout.CENTER);
        td = new Thread(this);
        td.start();
    }

    public void run() {
        while (in_game) {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            if (state != old_state) {
                removeAll();
                if (state == 0) {
                    sp = new StartPanel(size, this);
                    add(sp, BorderLayout.CENTER);
                } else if (state == 1) {
                    gp = new GamePanel(size, this);
                    add(gp, BorderLayout.CENTER);
                } else if (state == 2) {
                    gcp = new GameClearPanel(size, this);
                    add(gcp, BorderLayout.CENTER);
                } else if (state == 3) {
                    gop = new GameOverPanel(size, this);
                    add(gop, BorderLayout.CENTER);
                } else if (state == 4) {
                    in_game = false;
                    continue;
                }
                revalidate();
                repaint();
                old_state = state;
            }
        }
        System.exit(0);
    }
}

// ==================== StartPanel ====================
class StartPanel extends JPanel implements ActionListener, KeyListener {
    Dimension size;
    MainPanel mp;
    JButton bt;

    public StartPanel(Dimension size1, MainPanel mp1) {
        size = size1;
        mp = mp1;

        setLayout(null);
        setBackground(Color.white);

        Font f = new Font("SansSerif", Font.BOLD, 20);
        FontMetrics fm = getFontMetrics(f);
        String str = "遊び方";
        int w = fm.stringWidth(str) + 40;
        int h = fm.getHeight() + 10;

        bt = new JButton(str);
        bt.setFont(f);
        bt.addActionListener(this);
        bt.setSize(w, h);
        bt.setLocation(size.width/2 - w/2, 5);
        add(bt);

        addKeyListener(this);
        setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Serif", Font.BOLD, 30));
        g.setColor(Color.black);
        g.drawString("Game Title", size.width/2 - 100, size.height/2 - 50);

        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.drawString("ゲーム開始：「s」キー", size.width/2 - 100, size.height - 50);

        requestFocusInWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt) {
            String message = "【遊び方】\n\n"
                    + "・「s」キーでゲーム開始\n"
                    + "・ゲーム中に円をクリックするとゲームクリア\n"
                    + "・空白部分をクリックするとゲームオーバー\n"
                    + "・楽しんでください！";
            JOptionPane.showMessageDialog(this, message, "遊び方", JOptionPane.INFORMATION_MESSAGE);
            requestFocusInWindow();
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_S) {
            mp.state = 1;
        }
    }
    public void keyReleased(KeyEvent ke) {}
    public void keyTyped(KeyEvent ke) {}
}

// ==================== GamePanel（マウス判定版） ====================
class GamePanel extends JPanel implements Runnable, MouseListener {
    Dimension size;
    MainPanel mp;
    Random rand;
    Thread td;
    boolean in_game = true;
    int x[], y[];

    int CIRCLE_SIZE = 40;

    public GamePanel(Dimension size1, MainPanel mp1) {
        size = size1;
        mp = mp1;

        setLayout(null);
        setFocusable(true);
        addMouseListener(this);

        rand = new Random();
        x = new int[3];
        y = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = rand.nextInt(size.width - CIRCLE_SIZE);
            y[i] = rand.nextInt(size.height - CIRCLE_SIZE - 50); // 下の余白考慮
        }

        td = new Thread(this);
        td.start();
    }

    @Override
    public void run() {
        while (in_game) {
            try {
                if (mp.level == 1) Thread.sleep(1000);
                else if (mp.level == 2) Thread.sleep(500);
                else Thread.sleep(20);
            } catch (InterruptedException e) {}

            for (int i = 0; i < 3; i++) {
                x[i] = rand.nextInt(size.width - CIRCLE_SIZE);
                y[i] = rand.nextInt(size.height - CIRCLE_SIZE - 50);
            }
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.lightGray);

        for (int i = 0; i < 3; i++) {
            if (i == 0) g.setColor(Color.red);
            else if (i == 1) g.setColor(Color.green);
            else g.setColor(Color.blue);
            g.fillOval(x[i], y[i], CIRCLE_SIZE, CIRCLE_SIZE);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        boolean hit = false;
        int mx = e.getX();
        int my = e.getY();

        for (int i = 0; i < 3; i++) {
            if (mx >= x[i] && mx <= x[i]+CIRCLE_SIZE && my >= y[i] && my <= y[i]+CIRCLE_SIZE) {
                hit = true;
                break;
            }
        }

        in_game = false;
        if (hit) mp.state = 2; // クリア
        else mp.state = 3;     // オーバー
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}

// ==================== GameClearPanel ====================
class GameClearPanel extends JPanel implements ActionListener {
    Dimension size;
    MainPanel mp;
    JButton bt1, bt2;

    public GameClearPanel(Dimension size1, MainPanel mp1) {
        size = size1;
        mp = mp1;

        setLayout(null);
        setBackground(Color.white);

        Font f = new Font("SansSerif", Font.BOLD, 20);
        FontMetrics fm = getFontMetrics(f);

        bt1 = new JButton("ゲーム終了");
        bt1.setFont(f);
        bt1.addActionListener(this);
        int w1 = fm.stringWidth("ゲーム終了") + 40;
        int h1 = fm.getHeight() + 10;
        bt1.setSize(w1, h1);
        bt1.setLocation(size.width/2 - w1 -5, size.height - h1 - 20);
        add(bt1);

        String str2 = (mp.level == 3) ? "最初から再開" : "次のレベル";
        bt2 = new JButton(str2);
        bt2.setFont(f);
        bt2.addActionListener(this);
        int w2 = fm.stringWidth(str2) + 40;
        int h2 = fm.getHeight() + 10;
        bt2.setSize(w2, h2);
        bt2.setLocation(size.width/2 + 5, size.height - h2 - 20);
        add(bt2);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("SansSerif", Font.BOLD, 40));
        FontMetrics fm = g.getFontMetrics();
        String str = "Game Clear!";
        int w = fm.stringWidth(str);
        g.setColor(Color.black);
        g.drawString(str, size.width/2 - w/2, size.height/2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            mp.state = 4;
            bt1.setEnabled(false);
            bt2.setEnabled(false);
        } else {
            mp.level++;
            if (mp.level > 3) {
                mp.state = 0;
                mp.level = 1;
            } else mp.state = 1;
        }
    }
}

// ==================== GameOverPanel ====================
class GameOverPanel extends JPanel implements ActionListener {
    Dimension size;
    MainPanel mp;
    JButton bt1, bt2, bt3;

    public GameOverPanel(Dimension size1, MainPanel mp1) {
        size = size1;
        mp = mp1;

        setLayout(null);
        setBackground(Color.white);

        Font f = new Font("SansSerif", Font.BOLD, 10);
        FontMetrics fm = getFontMetrics(f);

        bt1 = new JButton("終了");
        bt1.setFont(f);
        bt1.addActionListener(this);
        int w1 = fm.stringWidth("終了") + 40;
        int h1 = fm.getHeight() + 10;
        bt1.setSize(w1, h1);

        bt2 = new JButton("現在のレベルで再開");
        bt2.setFont(f);
        bt2.addActionListener(this);
        int w2 = fm.stringWidth("現在のレベルで再開") + 40;
        int h2 = fm.getHeight() + 10;
        bt2.setSize(w2, h2);

        bt3 = new JButton("最初から再開");
        bt3.setFont(f);
        bt3.addActionListener(this);
        int w3 = fm.stringWidth("最初から再開") + 40;
        int h3 = fm.getHeight() + 10;
        bt3.setSize(w3, h3);

        int w = size.width/2 - (w1 + w2 + w3 +10)/2;
        bt1.setLocation(w, size.height - h1 -20);
        add(bt1);
        w += w1 + 5;
        bt2.setLocation(w, size.height - h1 -20);
        add(bt2);
        w += w2 +5;
        bt3.setLocation(w, size.height - h1 -20);
        add(bt3);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("SansSerif", Font.BOLD, 40));
        FontMetrics fm = g.getFontMetrics();
        String str = "Game Over!";
        int w = fm.stringWidth(str);
        g.setColor(Color.black);
        g.drawString(str, size.width/2 - w/2, size.height/2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            mp.state = 4;
            bt1.setEnabled(false);
            bt2.setEnabled(false);
            bt3.setEnabled(false);
        } else if (e.getSource() == bt2) {
            mp.state = 1;
        } else {
            mp.state = 0;
            mp.level = 1;
        }
    }
}

// ==================== 実行用 Main ====================
public class GameSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ゲームサンプル");
        Dimension size = new Dimension(600, 400);
        MainPanel mp = new MainPanel(size);
        frame.add(mp);
        frame.setSize(size);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
