import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Anime extends JFrame implements Runnable, ActionListener {
	boolean state;
	JButton b_start, b_stop;
	Test_Panel dp;
	Thread th;

	public Anime() {
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cP = getContentPane();

    // レイアウト，背景色，フォント
		JPanel pn = new JPanel();
		pn.setLayout(new BorderLayout(5, 10));
		pn.setBackground(new Color(225, 255, 225));
		cP.add(pn);
		//Font f = new Font("TimesRoman", Font.BOLD, 20);

    // 上のパネル（ボタンの設定）
		JPanel pn1 = new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn1.setBackground(new Color(225, 255, 225));
		pn.add(pn1, BorderLayout.NORTH);
		b_start = new JButton("開始");
		b_start.addActionListener(this);
		//b_start.setFont(f);
		pn1.add(b_start);
		b_stop = new JButton("停止");
		b_stop.addActionListener(this);
		//b_stop.setFont(f);
		pn1.add(b_stop);

    // 中央のパネル（描画領域）
		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(225, 255, 225));
		pn2.setLayout(null);
		pn.add(pn2, BorderLayout.CENTER);

    dp = new Test_Panel();
		dp.setSize(380, 175);
		dp.setLocation(10, 10);
		pn2.add(dp);

    // スレッドの生成
		th = new Thread(this);

    setVisible(true);
	}

  public static void main(String[] args) {
    new Anime();
  }

	public void stop()   // 他ページへ移動の際，一時的にスレッドを停止
	{
		state = false;
	}

	public void run()
	{
		while (state) {
			dp.count++;
			if (dp.count > 10)
				dp.count = 0;
			dp.repaint();   // 再描画
			try {
				th.sleep(100);   // 100 ms 毎の描画
			}
			catch (InterruptedException e) {}
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b_start) {   // 開始
			state = true;
			th.start();
		}
		else {   // 停止
			state    = false;
			th       = new Thread(this);
			dp.count = 0;
			dp.repaint();
		}
	}
}

class Test_Panel extends JPanel
{
	int count;
	Test_Panel()
	{
		setBackground(Color.white);
		count = 0;
	}
	public void paintComponent (Graphics g)   // 描画
	{
		super.paintComponent(g);   // 親クラスの描画(必ず必要)
		int r = 10;
		for (int i1 = 0; i1 < count; i1++) {
			g.drawOval(0, 0, 2*r, 2*r);
			r = (int)(1.5 * r);
		}
	}
}