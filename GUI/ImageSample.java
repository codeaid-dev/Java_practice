import javax.swing.*;
import java.awt.*;

public class ImageSample extends JPanel {
  private Image image;
  private int imgWidth, imgHeight;

  public ImageSample(String path) {
    // 画像を読み込む
    ImageIcon icon = new ImageIcon(path);
    image = icon.getImage();
    // 画像サイズ取得
    imgWidth = icon.getIconWidth();
    imgHeight = icon.getIconHeight();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    // 画面サイズ取得
    int w = getWidth();
    int h = getHeight();

    // 画面中央
    int centerX = (w-imgWidth)/2;
    int centerY = (h-imgHeight)/2;

    // 画像を描画
    // g.drawImage(image, 0, 0, this); // 画面左上隅
    g.drawImage(image, centerX, centerY, this); // 画面中央
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("画像表示サンプル");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // 読み込む画像ファイルのパスを指定
    ImageSample panel = new ImageSample("images/sample.jpg");

    frame.add(panel);
    frame.setSize(500, 400);
    frame.setLocationRelativeTo(null); // モニター中央
    frame.setVisible(true);
  }
}
