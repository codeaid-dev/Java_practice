import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.Container;
import java.awt.BorderLayout;
import java.util.ArrayList;

public class MatchingGameImg extends JFrame {
  ArrayList<ImageIcon> CardImage = new ArrayList<ImageIcon>();
  ArrayList<JLabel> cards = new ArrayList<JLabel>();
  ArrayList<Integer> status = new ArrayList<Integer>(); // 0:close, 1:open
  int first[] = new int[2]; // element0:card number, element1: card place
  int second[] = new int[2]; // element0:card number, element1: card place
  final int CARDSNUM = 28;

  // read image files for every cards and create JLabel to add it on panel with event for each.
  void initCards() {
    for (int i=0; i<=CARDSNUM; i++) {
      ImageIcon icon = new ImageIcon(new ImageIcon("images/card" + i + ".png").getImage().getScaledInstance(82, 120, Image.SCALE_DEFAULT));
      CardImage.add(icon);
    }
    for (int i=1; i<=CARDSNUM; i++) {
      ImageIcon icon = new ImageIcon(CardImage.get(i).getImage());
      icon.setDescription(""+i);
      JLabel label = new JLabel(icon);
      label.addMouseListener(new labelListener());
      cards.add(label);
      status.add(0);
    }
  }

  // shuffle cards on window.
  void shuffleCards() {
    for (int i=0; i<cards.size(); i++) {
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

  public MatchingGameImg() {
    setTitle("神経衰弱");
    setBounds(100, 100, 655, 540);
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
    setVisible(true);
  }

  // mouse click event
  // check card when clicked mouse
  public class labelListener extends MouseAdapter {
    public void mouseClicked(MouseEvent evt) {
      if (first[0] != 0 && second[0] != 0) {
        if (first[0] != second[0]) {
          setBack(first);
          setBack(second);
        }
        first[0] = 0;
        second[0] = 0;
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
              if (num>=15) {
                first[0] = num-14;
              } else {
                first[0] = num;
              }
              first[1] = i;
              status.set(i, 1);
            } else {
              if (num>=15) {
                second[0] = num-14;
              } else {
                second[0] = num;
              }
              second[1] = i;
              status.set(i, 1);
            }
          }
        }
      }

    }
  }

  public static void main(String[] args) {
    new MatchingGameImg();
  }
}
