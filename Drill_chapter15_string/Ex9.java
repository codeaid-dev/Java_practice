public class Ex9 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String s = new java.util.Scanner(System.in).nextLine();
//    String s = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.print("文字数 >>");
    int num = new java.util.Scanner(System.in).nextInt();
//    int num = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    String upper = s.substring(0,num).toUpperCase();
    System.out.println(upper+s.substring(num));
  }
}
