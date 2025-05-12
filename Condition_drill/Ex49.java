public class Ex49 {
  public static void main(String[] args) {
    System.out.print(">>");
    String s = new java.util.Scanner(System.in).nextLine();
    boolean flag = false;
    String result = "";
    for (int i=0; i<s.length(); i++) {
      if (s.charAt(i) == '(') {
          result += String.valueOf(s.charAt(i));
          flag = true;
          continue;
      } if (s.charAt(i) == ')') {
          result += String.valueOf(s.charAt(i));
          flag = false;
          continue;
      } if (flag) {
          result += "x";
      } else {
          result += String.valueOf(s.charAt(i));
      }
    }
    System.out.println(result);
  }
}
