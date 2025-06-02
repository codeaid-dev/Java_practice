import javax.swing.*;

public class BoxLayoutSample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BoxLayoutの例");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    
    panel.add(new JLabel("ユーザー名:"));
    panel.add(new JTextField(15));
    panel.add(Box.createVerticalStrut(10));
    panel.add(new JLabel("パスワード:"));
    panel.add(new JPasswordField(15));
    panel.add(Box.createVerticalStrut(10));
    panel.add(new JButton("ログイン"));

    frame.add(panel);
    frame.setVisible(true);
  }
}
