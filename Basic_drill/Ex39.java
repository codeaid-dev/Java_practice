public class Ex39 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    int num = new java.util.Scanner(System.in).nextInt();
//    int num = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println(num+"番目の偶数は"+(num*2-2));
  }
}
