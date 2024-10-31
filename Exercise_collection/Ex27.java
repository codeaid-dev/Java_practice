import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Ex27 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
    List<String> ss = List.of(s.split(""));
    HashSet<String> set = new HashSet<>(ss);
    HashMap<String,Integer> result = new HashMap<>();
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
