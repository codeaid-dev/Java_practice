package Exercise_var;

public class Ex43 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String[] s = new java.util.Scanner(System.in).nextLine().split(",");
    String str = s[0];
    int step = Integer.parseInt(s[1]);
    String result = "";
    for (int i=0; i<str.length(); i+=step) {
      if (i >= str.length()) {
        result += str.substring(i);
      } else {
        result += str.substring(i,i+1);
      }
    }
    System.out.println(result);
  }
}
