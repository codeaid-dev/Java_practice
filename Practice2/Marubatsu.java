import java.util.Scanner;

public class Marubatsu {
  public static void main(String[] args) {
    System.out.print("横数と縦数：");
    Scanner scan = new Scanner(System.in);
//    Scanner scan = new Scanner(System.in, "Shift-JIS"); //for Windows
    String str = scan.nextLine();
    String[] size = str.split(",", 0);
    int width = Integer.parseInt(size[0]);
    int height = Integer.parseInt(size[1]);
    String[] marubatsu = {"○", "✕"};
    int order = 1;

    for(int i = 0; i < height; i++) {
      String ch = "";
      order = 1 - order;
      for(int j = 0; j < width; j++) {
        if(j % 2 == 0) {
          ch += marubatsu[order];
        } else {
          ch += marubatsu[1 - order];
        }
      }
      System.out.println(ch);
    }
    scan.close();
  }
}
