public class Ex29 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String s = new java.util.Scanner(System.in).nextLine();
    String r = s.substring(0,s.length()/2);
    String l = s.substring(s.length()/2);
    int rn = Integer.parseInt(r);
    int ln = Integer.parseInt(l);
    System.out.println((rn*2) + " " + (ln/2));
  }
}
