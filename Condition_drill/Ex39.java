public class Ex39 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String s1 = new java.util.Scanner(System.in).nextLine();
    String s2 = "";
    for (int i=s1.length()-1; i>=0; i--) {
      s2 += s1.charAt(i);
      //char w = s1.charAt(i);
      //s2 += String.valueOf(w);
    }
    int n1 = Integer.parseInt(s1);
    int n2 = Integer.parseInt(s2);
    System.out.println(n1+"+"+n2+"="+(n1+n2));
  }
}
