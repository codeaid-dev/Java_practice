import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Ex27 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
    List<String> ss = List.of(s.split(""));
    Set<String> set = new HashSet<>(ss);
    Map<String,Integer> result = new HashMap<>();
    for (String c : set) {
      int count=0;
      for (String o : ss) {
        if (c.equals(o)) {
          count++;
        }
      }
      result.put(c,count);
    }
    System.out.println(result.toString());
  }
}
