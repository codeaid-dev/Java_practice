public class Ex10 {
  public static void main(String[] args) {
    System.out.println("結果：" + reverseString("hello"));
    System.out.println("結果：" + reverseString("おはよう"));
  }
  public static String reverseString(String str) {
    String result = "";
    for (int i = str.length()-1; i >= 0; i--) {
      result += str.charAt(i);
    }
    return result;
/*
    String[] strs = str.split("");
    for (int i = strs.length-1; i >= 0; i--) {
      result += strs[i];
    }
    return result;
*/
  }
}
