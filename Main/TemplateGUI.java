import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

public class TemplateGUI extends JFrame{
  // field
  /***** Constructor *****/
  public TemplateGUI(){
    setSize(400,300); // setting window size
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  /***** paint *****/
  public void paint(Graphics g){
    // Drawing command
  }

  /***** main *****/
  public static void main(String[] args){
    new TemplateGUI();
  }
}
