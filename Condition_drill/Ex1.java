public class Ex1 {
  public static void main(String[] args) {
    System.out.print("年齢は？>>");
    int age = new java.util.Scanner(System.in).nextInt();
    if (age < 18) {
      System.out.println("未成年");
    } else {
      System.out.println("成人");
    }
  }
}
