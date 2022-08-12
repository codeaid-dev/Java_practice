public class Ex59 {
  public static void main(String[] args) {
    System.out.print("単語1>>");
    String s1 = new java.util.Scanner(System.in).nextLine();
    String[] s1s = s1.split(" ");
    System.out.print("単語2>>");
    String s2 = new java.util.Scanner(System.in).nextLine();
    String[] s2s = s2.split(" ");
    for (int i=0; i<s1s.length; i++) {
      if (!s1s[i].equals(s2s[i])) {
        System.out.println(i+1);
        System.out.println(s1s[i]);
        System.out.println(s2s[i]);
      }
    }    
  }
}
