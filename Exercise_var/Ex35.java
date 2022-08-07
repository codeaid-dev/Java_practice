package Exercise_var;

public class Ex35 {
  public static void main(String[] args) {
    System.out.print("距離 >>");
    int dist = new java.util.Scanner(System.in).nextInt();
    System.out.print("時速 >>");
    int speed = new java.util.Scanner(System.in).nextInt();
    System.out.println("AからBへは"+(dist/speed)+"時間"+(int)((double)dist%speed/speed*60)+"分必要です");
  }
}
