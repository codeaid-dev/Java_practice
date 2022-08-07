package Exercise_var;

public class Ex42 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String s = new java.util.Scanner(System.in).nextLine();
    int len = s.length()/3;
    System.out.println(s.substring(len, len*2));
  }
}
