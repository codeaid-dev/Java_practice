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

public class SlotMachine extends JFrame implements ActionListener {

    final int MAX = 7;

    int[] iCount = { 1, 3, 5 };
    ArrayList<ImageIcon> SlotImage = new ArrayList<ImageIcon>();
    ArrayList<JLabel> slot = new ArrayList<JLabel>();
    Timer timer;
    JButton[] btn;
    JLabel label;
    boolean[] status = {false, false, false};

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

    public SlotMachine() {
        setTitle("スロットマシン");
        setBounds(200, 200, 500, 200);
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
        container.add(init_Button("スタート", "ストップ", "ストップ", "ストップ"), BorderLayout.SOUTH);
        btn[0].setEnabled(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SlotMachine();
    }

    public void actionPerformed(ActionEvent evt) {
        String cmd = evt.getActionCommand();
        if (cmd.equals("timer")) {
            for (int i=0; i < iCount.length; i++) {
                if (!status[i]) {
                    if (++iCount[i] == MAX)
                        iCount[i] = 0;
                    slot.get(i).setIcon(SlotImage.get(iCount[i]));
                }
            }
        }

        if (evt.getSource() == btn[0]) {
            timer.start();
            for (int i=0; i < status.length; i++) {
                status[i] = false;
            }
            label.setText("ストップでスロット画像を揃えよう");
            btn[0].setEnabled(false);
            btn[1].setEnabled(true);
            btn[2].setEnabled(true);
            btn[3].setEnabled(true);
        } else if (evt.getSource() == btn[1]) {
            status[0] = true;
            btn[1].setEnabled(false);
        } else if (evt.getSource() == btn[2]) {
            status[1] = true;
            btn[2].setEnabled(false);
        } else if (evt.getSource() == btn[3]) {
            status[2] = true;
            btn[3].setEnabled(false);
        }

        if ((status[0] && status[1] && !status[2] && iCount[0] == iCount[1])
            || (status[0] && !status[1] && status[2] && iCount[0] == iCount[2])
            || (!status[0] && status[1] && status[2] && iCount[1] == iCount[2])) {
            label.setText("リーチです");
        }

        if (status[0] && status[1] && status[2]) {
            if (iCount[0] == iCount[1] && iCount[1] == iCount[2]) {
                label.setText("3つそろいました!!おめでとう");
            } else {
                label.setText("残念でした");
            }
            btn[0].setEnabled(true);
        }
    }
}