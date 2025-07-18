public class Ex37 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    int num = new java.util.Scanner(System.in).nextInt();
//    int num = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    int H = num/3600;
    int M = num%3600/60;
    int S = num%60;
    System.out.println(H+"時間"+M+"分"+S+"秒");
  }
}
