import javax.swing.*;
import java.awt.*;

public class DrawCircleByInput extends JPanel {
  private static int numCircle = 10;

  public DrawCircleByInput() {
    setPreferredSize(new Dimension(500, 500));
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    int size = 500/numCircle;
    for (int y = 0; y < numCircle; y++) {
      for (int x = 0; x < numCircle; x++) {
        g.fillOval(x*size, y*size, size, size);
      }
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("円を縦横に並べる②");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    JTextField numInput = new JTextField("", 5);
    JButton showButton = new JButton("表示");
    JPanel topPanel = new JPanel();
    topPanel.add(new JLabel("円の数: "));
    topPanel.add(numInput);
    topPanel.add(showButton);

    DrawCircleByInput drawPanel = new DrawCircleByInput();

    showButton.addActionListener(e -> {
      try {
        int num = Integer.parseInt(numInput.getText());
        numCircle = num;
      } catch (NumberFormatException ex) {
        numCircle = 10;
      }
      drawPanel.repaint();
    });

    frame.add(topPanel, BorderLayout.NORTH);
    frame.add(drawPanel, BorderLayout.CENTER);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
