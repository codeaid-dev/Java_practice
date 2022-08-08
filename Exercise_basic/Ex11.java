public class Ex11 {
  public static void main(String[] args) {
    int up=20, bottom=35, height=30;
    int tri = bottom*height/2;
    int tra = (up+bottom)*height/2;
    int rec = bottom*height;
    int cir = (int)((height/2)*(height/2)*3.14);
    System.out.println("総面積は"+(tri+tra+rec+cir)+"平方cmです");
  }
}
