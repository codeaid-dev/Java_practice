package Exercise_var;

public class Ex5 {
  public static void main(String[] args) {
    System.out.print("ルーレットの数 >>");
    int num = new java.util.Scanner(System.in).nextInt();
    System.out.println("ゴールできる確率は" + (int)((double)1/num*100) + "%です");
  }
}
