import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SphereEat extends JPanel implements Runnable, ActionListener {
  int enemyCount = 100;
  ArrayList<Enemy> EnemyList = new ArrayList<Enemy>();
  Timer timer;
  Thread th;
  boolean st;
  JLabel l;

  public SphereEat() {
    setBackground(Color.black);
    MyListener myListener = new MyListener();
    addMouseListener(myListener);
    addMouseMotionListener(myListener);

    timer = new Timer(200, this);
    timer.setActionCommand("timer");

    Random rand = new Random();
    for (int i=0; i<enemyCount; i++) {
      Enemy s = new Enemy();
      s.x = 0;
      s.y = rand.nextInt(400);
      s.color = Color.WHITE;
      s.isActive = false;
      s.size = 50;
      EnemyList.add(s);
    }

    l = new JLabel();
    l.setText("Thread");
    l.setForeground(Color.white);
    add(l, BorderLayout.SOUTH);
    th = new Thread(this);
    setVisible(true);
  }

	public void stop()   // 他ページへ移動の際，一時的にスレッドを停止
	{
		st = false;
	}

	public void run()
	{
		while (st) {
      l.setText("Thread Start");
			repaint();
			try {
				th.sleep(100);   // 100 ms 毎の描画
			}
			catch (InterruptedException e) {}
		}
	}

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.white);
    for (Enemy s: EnemyList) {
      s.x += 5;
      g.fillOval(s.x, s.y, s.size, s.size);
    }
  }

  public void actionPerformed(ActionEvent evt) {
    repaint();
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("Sphere Eat");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new SphereEat());
    frame.getContentPane().setBackground(Color.black);
    frame.setSize(600, 400);
    frame.setVisible(true);
  }

  class MyListener extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
      /*Graphics g = getGraphics();
      g.setColor(Color.white);
      g.fillOval(e.getX(), e.getY(), playerSize, playerSize);
      g.dispose();*/
      st = true;
      //timer.start();
    }

    public void mouseMoved(MouseEvent e) {
      /*playerX = e.getX()-(playerSize/2);
      playerY = e.getY()-(playerSize/2);
      repaint();*/
    }
  }
}

class Player extends JPanel {
  int playerSize = 20;
  int playerX;
  int playerY;
  public Player() {
    setBackground(Color.black);
  }
  public void paintComponent (Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.white);
    g.fillOval(playerX, playerY, playerSize, playerSize);
  }
}

class Enemy {
  public int x;
  public int y;
  public boolean isActive;
  public int speed;
  public int size;
  public Color color;

  public Enemy() {

  }
}
