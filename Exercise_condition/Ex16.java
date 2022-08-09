public class Ex16 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s1 = new java.util.Scanner(System.in).nextLine();
    System.out.print("残す文字>>");
    String s2 = new java.util.Scanner(System.in).nextLine();
    String[] s3 = s1.split("");
    String s4="";
    for (String w : s3) {
      if (s2.equals(w)) {
        s4 += w;
      }
    }
    System.out.println(s4);
  }
}
