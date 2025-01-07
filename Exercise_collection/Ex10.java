import java.util.HashMap;
import java.util.Map;

public class Ex10 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
    Map<String,String> map = new HashMap<>();
    map.put("front", s.substring(0,s.length()/2));
    map.put("behind", s.substring(s.length()/2));
    System.out.println(map.toString());
  }
}
