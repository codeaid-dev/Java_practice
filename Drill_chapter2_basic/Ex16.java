public class Ex16 {
  public static void main(String[] args) {
    System.out.print("距離 >>");
    int dist = new java.util.Scanner(System.in).nextInt();
//    int dist = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.print("時速 >>");
    int speed = new java.util.Scanner(System.in).nextInt();
//    int speed = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println("AからBへは"+(dist/speed)+"時間"+(int)((double)dist%speed/speed*60)+"分必要です");
  }
}
