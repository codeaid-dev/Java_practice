package Exercise_var;

public class Ex30 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String s = new java.util.Scanner(System.in).nextLine();
    System.out.print("文字数 >>");
    int num = new java.util.Scanner(System.in).nextInt();
    String upper = s.substring(0,num).toUpperCase();
    System.out.println(upper+s.substring(num));
  }
}
