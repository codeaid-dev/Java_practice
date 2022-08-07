package Exercise_var;

public class Ex32 {
  public static void main(String[] args) {
    System.out.print("入力1 >>");
    int n1 = new java.util.Scanner(System.in).nextInt();
    System.out.print("入力2 >>");
    int n2 = new java.util.Scanner(System.in).nextInt();
    System.out.println(n1+"x"+n2+"="+(n1*n2)+"の結果は"+(String.valueOf(n1*n2).length())+"桁");
  }
}
