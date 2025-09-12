import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SlotMoji {
  static Timer timer;
  public static void main(String[] args) {
    JFrame frame = new JFrame("スロットマシン");
    JLabel slot[] = new JLabel[3];
    JButton btn[] = new JButton[3];
    JButton start = new JButton("スタート");
    boolean[] status = {true, true, true};

    JLabel label1 = new JLabel("スタートを押して始めてください", JLabel.CENTER);
    frame.add(label1, BorderLayout.NORTH);

    JPanel panel1 = new JPanel();
    int num1 = (int)(Math.random() * 10);
    slot[0] = new JLabel(String.valueOf(num1));
    int num2 = (int)(Math.random() * 10);
    slot[1] = new JLabel(String.valueOf(num2));
    int num3 = (int)(Math.random() * 10);
    slot[2] = new JLabel(String.valueOf(num3));
    slot[0].setFont(new Font("Arial", Font.PLAIN, 80));
    slot[1].setFont(new Font("Arial", Font.PLAIN, 80));
    slot[2].setFont(new Font("Arial", Font.PLAIN, 80));
    panel1.add(slot[0]);
    panel1.add(slot[1]);
    panel1.add(slot[2]);
    frame.add(panel1, BorderLayout.CENTER);

    int delay = 200;
    ActionListener drum = new ActionListener() {
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
    timer = new Timer(delay, drum);
    start.addActionListener(drum);
    JPanel panel2 = new JPanel();
    panel2.add(start);

    btn[0] = new JButton("ストップ");
    btn[0].addActionListener(drum);
    btn[1] = new JButton("ストップ");
    btn[1].addActionListener(drum);
    btn[2] = new JButton("ストップ");
    btn[2].addActionListener(drum);
    panel2.add(btn[0]);
    panel2.add(btn[1]);
    panel2.add(btn[2]);

    frame.add(panel2, BorderLayout.SOUTH);

    frame.setSize(500, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
