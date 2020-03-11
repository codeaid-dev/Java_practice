import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class NameCard extends JFrame{
  // field
  /***** Constructor *****/
  public NameCard(){
    setSize(400,300); // setting window size
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  /***** paint *****/
  public void paint(Graphics g){
    // Drawing - Line Weight
    Graphics2D g2 = (Graphics2D)g;
    super.paint(g2);
    BasicStroke bs = new BasicStroke(7);
    g2.setStroke(bs);

    // Drawing PC
    int x=50, y=40;
    int mwidth=100, mheight=80, arcW=10, arcH=10;
    int dwidth=50, dheight=107;

    // Drawing Monitor
    g2.setColor(Color.gray);
    g2.fillRoundRect(x, y, mwidth, mheight, arcW, arcH);
    g2.fillRect(x+25, y+mheight, mwidth/2, mheight/4);
    g2.drawLine(x+15, y+mheight+20, x+mwidth-15, y+mheight+20);
    g2.setColor(Color.white);
    g2.fillRect(x+10, y+10, mwidth-20, mheight-20);
    // Drawing Desktop
    g2.setColor(Color.gray);
    g2.fillRoundRect(x+mwidth+10, y, dwidth, dheight, arcW, arcH);
    g2.setColor(Color.white);
    g2.drawLine(x+mwidth+25, y+20, x+mwidth+45, y+20);
    g2.drawLine(x+mwidth+25, y+35, x+mwidth+45, y+35);
    g2.fillOval(x+mwidth+25, y+70, 20, 20);

    // Drawing Name
    Font font1 = new Font("Times New Roman", Font.PLAIN, 25);
    g.setFont(font1);
    g.setColor(Color.blue);
    g.drawString("Shin Ikeda", 100, 200);
    Font font2 = new Font("Arial", Font.PLAIN, 16);
    g.setFont(font2);
    g.setColor(Color.black);
    g.drawString("ID: abc-123-456-789", 100, 220);
    Font font3 = new Font("Arial", Font.PLAIN, 16);
    g.setFont(font3);
    g.setColor(Color.black);
    g.drawString("Information Science and Engineering", 100, 240);
    Font font4 = new Font("Arial", Font.PLAIN, 16);
    g.setFont(font4);
    g.setColor(Color.black);
    g.drawString("Ritsumeikan University Student", 100, 260);
  }

  /***** main *****/
  public static void main(String[] args){
    new NameCard();
  }
}
