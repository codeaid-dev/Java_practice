import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Font;
import java.awt.BorderLayout;
import java.lang.Math;

public class SlotMini extends JFrame{
  JLabel slot[] = new JLabel[3];
  JButton btn[] = new JButton[3];
  JButton start;
  Timer timer;
  boolean[] status = {false, false, false};

  public SlotMini(){
    setTitle("スロットマシーン");
    setBounds(100, 100, 500, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container container = getContentPane();

    JLabel label1 = new JLabel("スタートを押して始めてください", JLabel.CENTER);
    container.add(label1, BorderLayout.NORTH);

    JPanel panel1 = new JPanel();
    int num = (int)(Math.random() * 10);
    slot[0] = new JLabel(String.valueOf(num));
    slot[1] = new JLabel(String.valueOf(++num));
    slot[2] = new JLabel(String.valueOf(++num));
    slot[0].setFont(new Font("Arial", Font.PLAIN, 80));
    slot[1].setFont(new Font("Arial", Font.PLAIN, 80));
    slot[2].setFont(new Font("Arial", Font.PLAIN, 80));
    panel1.add(slot[0]);
    panel1.add(slot[1]);
    panel1.add(slot[2]);
    container.add(panel1, BorderLayout.CENTER);

    int delay = 200;
    ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed (ActionEvent evt) {
        if (evt.getSource() == start) {
          timer.start();
          for (int i=0; i < status.length; i++) {
            status[i] = false;
          }
        }

        for (int i = 0; i < btn.length; i++) {
          if (evt.getSource() == btn[i]) {
            status[i] = true;
          }
          if (status[i] == false) {
            int num = Integer.parseInt(slot[i].getText());
            if (++num >= 10)
              num = 0;
            slot[i].setText(String.valueOf(num));
          }
        }
      }
    };
    timer = new Timer(delay, taskPerformer);

    JPanel panel2 = new JPanel();
    start = new JButton("スタート");
    start.addActionListener(taskPerformer);
    panel2.add(start);

    btn[0] = new JButton("ストップ");
    btn[0].addActionListener(taskPerformer);
    btn[1] = new JButton("ストップ");
    btn[1].addActionListener(taskPerformer);
    btn[2] = new JButton("ストップ");
    btn[2].addActionListener(taskPerformer);
    panel2.add(btn[0]);
    panel2.add(btn[1]);
    panel2.add(btn[2]);

    container.add(panel2, BorderLayout.SOUTH);

    setVisible(true);
 }

  public static void main(String[] args) {
    new SlotMini();
  }

}