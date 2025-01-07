import java.util.ArrayList;
import java.util.List;

public class Ex31 {
  public static void main(String[] args) {
    String[] ss = {"a", "b", "c", "d", "", "f", "g", "", "h"};
    List<String> result = new ArrayList<>();
    for (String s : ss) {
      if (s.equals("")) {
        break;
      }
      result.add(s);
    }
    System.out.println(result.toString());
  }
}
