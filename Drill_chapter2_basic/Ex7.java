public class Ex7 {
  public static void main(String[] args) {
    System.out.print("上底 >>");
    int up = new java.util.Scanner(System.in).nextInt();
//    int up = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.print("下底 >>");
    int bottom = new java.util.Scanner(System.in).nextInt();
//    int bottom = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.print("高さ >>");
    int height = new java.util.Scanner(System.in).nextInt();
//    int height = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println("上底"+up+"cmと下底"+bottom+"cmで高さ"+height+"cmの台形の面積は"+(up+bottom)*height/2+"平方cmです");
  }
}
