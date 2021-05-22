import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.BorderLayout;
import java.util.ArrayList;

public class MatchingGameCom extends JFrame {
  ArrayList<ImageIcon> CardImage = new ArrayList<ImageIcon>();
  ArrayList<JLabel> cards = new ArrayList<JLabel>();
  ArrayList<Integer> status = new ArrayList<Integer>(); // 0:close, 1:open
  int first[] = new int[2]; // element0:card number, element1: card place
  int second[] = new int[2]; // element0:card number, element1: card place
  final int CARDSNUM = 14;
  boolean turn = true; // true:plyer, false:computer
  Timer timer; // event timer for computer

  JButton tb; //turn button

  // read image files for every cards and create JLabel to add it on panel with event for each.
  void initCards() {
    for (int i=0; i<CARDSNUM+1; i++) {
      ImageIcon icon = new ImageIcon(new ImageIcon("card" + i + ".png").getImage().getScaledInstance(82, 120, Image.SCALE_DEFAULT));
      CardImage.add(icon);
    }
    for (int i=2; i<CARDSNUM*2+2; i++) {
      ImageIcon icon = new ImageIcon(CardImage.get((int)Math.floor(i/2)).getImage());
      icon.setDescription(""+(i/2));
      JLabel label = new JLabel(icon);
      label.addMouseListener(new labelListener());
      cards.add(label);
      status.add(0);
    }
  }

  // shuffle cards on window.
  void shuffleCards() {
    for (int i=0; i<CARDSNUM*2; i++) {
      int num = (int)(Math.random() * i);
      JLabel tmp = cards.get(i);
      cards.set(i, cards.get(num));
      cards.set(num, tmp);
    }
  }

  void setBack(int id[]) {
    status.set(id[1], 0);
    ImageIcon icon = (ImageIcon)cards.get(id[1]).getIcon();
    icon.setImage(CardImage.get(0).getImage());
    cards.get(id[1]).updateUI();
  }

  public MatchingGameCom() {
    setTitle("神経衰弱");
    setBounds(100, 100, 655, 600/*540*/);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container container = getContentPane();

    initCards();
    shuffleCards();

    for (int i=0; i<cards.size(); i++) {
      ImageIcon icon = (ImageIcon)cards.get(i).getIcon();
      icon.setImage(CardImage.get(0).getImage());
    }

    JPanel panel = new JPanel();
    for (JLabel l : cards)
        panel.add(l);

    container.add(panel, BorderLayout.CENTER);

    timer = new Timer(3000, new eventListener());
    timer.setActionCommand("timer");
    /*
    JPanel bp = new JPanel();
    tb = new JButton("ターン");
    tb.addActionListener(new eventListener());
    bp.add(tb);
    container.add(bp, BorderLayout.SOUTH);
    */

    setVisible(true);
  }

  public class eventListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
      String cmd = evt.getActionCommand();
      if (cmd.equals("timer")) {
        if (!turn) { // only for computer
          if (first[0] != 0 && second[0] != 0) {
            if (first[0] != second[0]) {
              setBack(first);
              setBack(second);
            }
            first[0] = 0;
            second[0] = 0;
            turn = true;
            timer.stop();
            return;
          }

          int cn = (int)(Math.random() * CARDSNUM*2);
          while (first[0]==0 || second[0]==0) {
            if (status.get(cn) == 0) {
              ImageIcon icon = (ImageIcon)cards.get(cn).getIcon();
              int num = Integer.parseInt(icon.getDescription());
              icon.setImage(CardImage.get(num).getImage());
              cards.get(cn).updateUI();
              if (first[0] == 0) {
                first[0] = num;
                first[1] = cn;
                status.set(cn, 1);
              } else {
                second[0] = num;
                second[1] = cn;
                status.set(cn, 1);
              }
            }
            cn = (int)(Math.random() * CARDSNUM*2);
          }
        }
      }
    }
  }
  // mouse click event
  // check card when clicked mouse
  public class labelListener extends MouseAdapter {
    public void mouseClicked(MouseEvent evt) {
      if (turn) { // only for player
        if (first[0] != 0 && second[0] != 0) {
          if (first[0] != second[0]) {
            setBack(first);
            setBack(second);
          }
          first[0] = 0;
          second[0] = 0;
          turn = false;
          timer.start();
          return;
        }

        for (int i=0; i<cards.size(); i++) {
          if (evt.getSource() == cards.get(i)) {
            if (status.get(i) == 0) {
              ImageIcon icon = (ImageIcon)cards.get(i).getIcon();
              int num = Integer.parseInt(icon.getDescription());
              icon.setImage(CardImage.get(num).getImage());
              cards.get(i).updateUI();
              if (first[0] == 0) {
                first[0] = num;
                first[1] = i;
                status.set(i, 1);
              } else {
                second[0] = num;
                second[1] = i;
                status.set(i, 1);
              }
            }
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    new MatchingGameCom();
  }
}
