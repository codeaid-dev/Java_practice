import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.BorderLayout;
import java.util.ArrayList;

public class SlotMachineOrg extends JFrame implements ActionListener {

    final int StopONE = 1;
    final int StopTWO = 2;
    final int StopTHREE = 3;
    final int MAX = 7;

    int iStopCount = StopONE;
    int[] iCount = { 1, 3, 5 };
    ArrayList<ImageIcon> SlotImage = new ArrayList<ImageIcon>();
    ArrayList<JLabel> slot = new ArrayList<JLabel>();
    Timer timer;
    JButton[] btn;
    JLabel label;

    JPanel init_Button(String... args) {
        JPanel p = new JPanel();
        btn = new JButton[args.length];
        for (int i = 0; i < args.length; i++) {
            btn[i] = new JButton(args[i]);
            btn[i].setEnabled(false);
            btn[i].addActionListener(this);
            p.add(btn[i]);
        }
        return p;
    }

    public SlotMachineOrg() {
        setTitle("スロットマシン");
        setBounds(200, 200, 400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timer = new Timer(300, this);
        timer.setActionCommand("timer");

        Container container = getContentPane();
        label = new JLabel("スタートを押して始めてください", JLabel.CENTER);
        container.add(label, BorderLayout.NORTH);

        for (int k = 1; k <= MAX; k++)
            SlotImage.add(new ImageIcon("Slot" + k + ".jpg"));

        slot.add(new JLabel(SlotImage.get(0)));
        slot.add(new JLabel(SlotImage.get(2)));
        slot.add(new JLabel(SlotImage.get(4)));

        JPanel panel = new JPanel();
        for (JLabel l : slot)
            panel.add(l);

        container.add(panel, BorderLayout.CENTER);
        container.add(init_Button("スタート", "ストップ"), BorderLayout.SOUTH);
        btn[0].setEnabled(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SlotMachineOrg();
    }

    public void actionPerformed(ActionEvent evt) {
        String cmd = evt.getActionCommand();
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
        if (evt.getSource() == btn[0]) {
            timer.start();
            label.setText("ストップで数字を揃えよう");
            btn[0].setEnabled(false);
            btn[1].setEnabled(true);
        } else if (evt.getSource() == btn[1]) {
            switch (iStopCount) {
            case StopONE:
                label.setText("2つ目も" + (iCount[0] + 1) + "で止めよう");
                iStopCount = StopTWO;
                break;
            case StopTWO:
                label.setText("ストップで全部止まるよ");
                if (iCount[0] == iCount[1])
                    label.setText("リーチだ");
                iStopCount = StopTHREE;
                break;
            case StopTHREE:
                timer.stop();
                if (iCount[0] == iCount[1] && iCount[1] == iCount[2]) {
                    if (iCount[0] == MAX - 1)
                        label.setText("やった!!最高得点だ");
                    else
                        label.setText("やった!!おめでとう");
                } else
                    label.setText("残念でした");
                iStopCount = StopONE;
                btn[0].setEnabled(true);
                btn[1].setEnabled(false);
            }
        }
    }
}