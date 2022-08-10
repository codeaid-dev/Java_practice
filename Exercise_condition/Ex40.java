public class Ex40 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String s1 = new java.util.Scanner(System.in).nextLine();
    System.out.print("数える文字列 >>");
    String s2 = new java.util.Scanner(System.in).nextLine();
    String[] s1s = s1.split("");
    int count=0;
    for (String comp : s1s) {
      if (comp.equals(s2)) {
        count++;
      }
    }
    System.out.println("\""+s1+"\""+"にある"+"\""+s2+"\""+"の数は、"+count+"個");
  }
}
