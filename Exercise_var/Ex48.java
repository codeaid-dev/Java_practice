package Exercise_var;

public class Ex48 {
  public static void main(String[] args) {
    System.out.print("巣穴の距離 >>");
    int D = new java.util.Scanner(System.in).nextInt();
    System.out.print("大ジャンプの距離 >>");
    int L = new java.util.Scanner(System.in).nextInt();
    System.out.println("必要回数："+((D/L)+(D%L)));
  }
}
