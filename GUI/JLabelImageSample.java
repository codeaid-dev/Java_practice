import javax.swing.*;
import java.awt.*;

public class JLabelImageSample {
  public static void main(String[] args) {
    // フレーム作成
    JFrame frame = new JFrame("JLabelで画像表示");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // ImageIconを作成（画像を読み込む）
    ImageIcon icon = new ImageIcon("images/sample.jpg");
    // 画像サイズ取得
    int imgWidth = icon.getIconWidth();
    int imgHeight = icon.getIconHeight();
    // 縦横比を維持してスケーリング
    double scaleX = (double) 500 / imgWidth;
    double scaleY = (double) 700 / imgHeight;
    double scale = Math.min(scaleX, scaleY);
    int newWidth = (int) (imgWidth * scale);
    int newHeight = (int) (imgHeight * scale);
    // リサイズ処理（幅500, 高さ700）
    // Image scaled = icon.getImage().getScaledInstance(500, 700, Image.SCALE_SMOOTH);
    Image scaled = icon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    // JLabelに画像を設定
    // JLabel label = new JLabel(icon);
    JLabel label = new JLabel(new ImageIcon(scaled));
    // フレームに追加
    frame.add(label);

    frame.pack(); // 画像サイズに自動調整
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
