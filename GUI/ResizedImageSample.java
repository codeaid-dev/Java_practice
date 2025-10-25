import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ResizedImageSample extends JPanel {
  // private BufferedImage image;
  private Image image;
  private int imgWidth, imgHeight;

  public ResizedImageSample(String path) {
    // 画像を読み込む
    ImageIcon icon = new ImageIcon(path);
    image = icon.getImage();
    // 画像サイズ取得
    imgWidth = icon.getIconWidth();
    imgHeight = icon.getIconHeight();
    // try {
    //     image = ImageIO.read(new File(path));
    //     imgWidth = image.getWidth();
    //     imgHeight = image.getHeight();
    //     System.out.println("元画像サイズ: 幅=" + imgWidth + ", 高さ=" + imgHeight);
    // } catch (IOException e) {
    //     e.printStackTrace();
    // }
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    // 画面サイズ取得
    int w = getWidth();
    int h = getHeight();

    // パネルサイズに合わせて描画
    // g.drawImage(image, 0, 0, w, h, this); // 画像が変形する

    // 縦横比を維持してスケーリング
    double scaleX = (double) w / imgWidth;
    double scaleY = (double) h / imgHeight;
    double scale = Math.min(scaleX, scaleY);
    int newWidth = (int) (imgWidth * scale);
    int newHeight = (int) (imgHeight * scale);

    // 画面中央
    int centerX = (w-newWidth)/2;
    int centerY = (h-newHeight)/2;

    // パネルサイズに合わせるが比率は変えない
    g.drawImage(image, centerX, centerY, newWidth, newHeight, this);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("リサイズ画像＋サイズ取得");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ResizedImageSample panel = new ResizedImageSample("images/sample.jpg");
    frame.add(panel);

    // frame.setSize(500, 400);
    frame.setSize(500, 700);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}