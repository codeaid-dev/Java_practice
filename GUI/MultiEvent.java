import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiEvent {
  static Timer timer;

  public static void main(String[] args) {
    JFrame frame = new JFrame("複数イベント");
    JButton start = new JButton("スタート");
    JPanel panel1 = new JPanel();
    JLabel label1 = new JLabel("スタートを押して始めてください", JLabel.CENTER);
    JLabel label2 = new JLabel("---", JLabel.CENTER);
    frame.add(label1, BorderLayout.NORTH);
    panel1.add(start);
    frame.add(panel1, BorderLayout.CENTER);
    frame.add(label2, BorderLayout.SOUTH);
    frame.setSize(200, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    int delay = 1000;
    ActionListener drum = new ActionListener() {
      int count = 0;
      public void actionPerformed (ActionEvent evt) {
        if (evt.getSource() == start) {
          label2.setText("ボタンが押された");
          count = 0;
          timer.start();
        } else {
          count++;
          label2.setText(""+count);
        }

      }
    };
    timer = new Timer(delay, drum);
    start.addActionListener(drum);
  }
}
