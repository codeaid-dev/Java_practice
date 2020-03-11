import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class NameCardBook extends JFrame{
  // field
  /***** Constructor *****/
  public NameCardBook(){
    setSize(400,300); // setting window size
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  /***** paint *****/
  public void paint(Graphics g){
    // Drawing Arc - Line Weight
    Graphics2D g2 = (Graphics2D)g;
    super.paint(g2);
    BasicStroke bs = new BasicStroke(7);
    g2.setStroke(bs);

    // Drawing Arc - 6
    int x=50, y=50;
    int width=100, height=50, start=40, arc=100;

    g2.setColor(Color.gray);
    g2.drawArc(x, y, width, height, start, arc);
    g2.drawArc(x, y+80, width, height, start, arc);
    g2.drawArc(x, y+100, width, height, start, arc);
    g2.drawArc(x+80, y, width, height, start, arc);
    g2.drawArc(x+80, y+80, width, height, start, arc);
    g2.drawArc(x+80, y+100, width, height, start, arc);
    g2.drawLine(x+10, y+10, x+10, y+110);
    g2.drawLine(x+90, y+10, x+90, y+85);
    g2.drawLine(x+170, y+10, x+170, y+110);

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
    new NameCardBook();
  }
}
