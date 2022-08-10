public class Ex35 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s1 = new java.util.Scanner(System.in).nextLine();
    System.out.print("並び方>>");
    String[] s2 = new java.util.Scanner(System.in).nextLine().split("x");
    int yoko = Integer.parseInt(s2[0]);
    int tate = Integer.parseInt(s2[1]);
    if (s1.length() >= yoko*tate) {
      for (int i=0; i<tate; i++) {
        System.out.println(s1.substring(0, yoko));
        s1 = s1.substring(yoko);
      }
    } else {
      System.out.println("出力できません");
    }
  }
}
