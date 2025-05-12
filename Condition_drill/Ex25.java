public class Ex25 {
  public static void main(String[] args) {
    String[] words = {"hello","eye","bye","noon"};
    int count=0;
    for (String s : words) {
      if (s.charAt(0) == s.charAt(s.length()-1)) {
        count++;
      }
    }
    System.out.println(count);
  }
}
