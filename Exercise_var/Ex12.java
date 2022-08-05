package Exercise_var;

public class Ex12 {
  public static void main(String[] args) {
    System.out.print("右辺入力 >>");
    int left = new java.util.Scanner(System.in).nextInt();
    System.out.print("左辺入力 >>");
    int right = new java.util.Scanner(System.in).nextInt();
    System.out.println(left+"割る"+right+"は、"+left/right+"余り"+left%right+"です");
  }
}
