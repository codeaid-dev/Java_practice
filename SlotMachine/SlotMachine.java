import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
/*
enum Stop {
    ONE, TWO, THREE
}
*/
public class SlotMachine extends JFrame implements ActionListener {

    final int StopONE = 1;
    final int StopTWO = 2;
    final int StopTHREE = 3;
    final int MAX = 7;

    int iStopCount = StopONE;
    int[] iCount = { 1, 3, 5 };
    ArrayList<ImageIcon> SlotImage = new ArrayList<ImageIcon>();
    ArrayList<JLabel> slot = new ArrayList<JLabel>();
    Timer timer;
    JButton[] bt;
    JLabel lbel = new JLabel("スタートで始まるよ", JLabel.CENTER);

    JPanel init_Button(String... args) {
        JPanel p = new JPanel();
        bt = new JButton[args.length];
        for (int i = 0; i < args.length; i++) {
            bt[i] = new JButton(args[i]);
            bt[i].setEnabled(false);
            bt[i].addActionListener(this);
            p.add(bt[i]);
        }
        return p;
    }

    public SlotMachine(String title) {
        super(title);
        timer = new Timer(300, this);
        timer.setActionCommand("timer");
        setBounds(200, 200, 400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add("North", lbel);
        for (int k = 1; k <= MAX; k++)
            SlotImage.add(new ImageIcon("Slot" + k + ".jpg"));
        slot.add(new JLabel(SlotImage.get(0)));
        slot.add(new JLabel(SlotImage.get(2)));
        slot.add(new JLabel(SlotImage.get(4)));
        JPanel p = new JPanel();
        for (JLabel l : slot)
            p.add(l);
        add("Center", p);
        add("South", init_Button("スタート", "ストップ"));
        bt[0].setEnabled(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SlotMachine("スロットマシン");
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("timer")) {
            int i = 0;
            if (iStopCount == StopTWO)
                i = 1;
            else if (iStopCount == StopTHREE)
                i = 2;
            for (; i < iCount.length; i++) {
                if (++iCount[i] == MAX)
                    iCount[i] = 0;
                slot.get(i).setIcon(SlotImage.get(iCount[i]));
            }
        }
        if (e.getSource() == bt[0]) {
            timer.start();
            lbel.setText("ストップで数字を揃えよう");
            bt[0].setEnabled(false);
            bt[1].setEnabled(true);
        } else if (e.getSource() == bt[1]) {
            switch (iStopCount) {
            case StopONE:
                lbel.setText("2つ目も" + (iCount[0] + 1) + "で止めよう");
                iStopCount = StopTWO;
                break;
            case StopTWO:
                lbel.setText("ストップで全部止まるよ");
                if (iCount[0] == iCount[1])
                    lbel.setText("リーチだ");
                iStopCount = StopTHREE;
                break;
            case StopTHREE:
                timer.stop();
                if (iCount[0] == iCount[1] && iCount[1] == iCount[2]) {
                    if (iCount[0] == MAX - 1)
                        lbel.setText("やった!!最高得点だ");
                    else
                        lbel.setText("やった!!おめでとう");
                } else
                    lbel.setText("残念でした");
                iStopCount = StopONE;
                bt[0].setEnabled(true);
                bt[1].setEnabled(false);
            }
        }
    }
}