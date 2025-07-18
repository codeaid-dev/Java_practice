import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    System.out.print("入力1 >>");
    String str1 = new Scanner(System.in).nextLine();
//    String str1 = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.print("入力2 >>");
    String str2 = new Scanner(System.in).nextLine();
//    String str2 = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.println("先頭からのインデックス：" + str1.indexOf(str2));
    System.out.println("末尾からのインデックス：" + str1.lastIndexOf(str2));
  }
}
