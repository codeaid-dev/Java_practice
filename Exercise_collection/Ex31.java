import java.util.ArrayList;

public class Ex31 {
  public static void main(String[] args) {
    String[] ss = {"a", "b", "c", "d", "", "f", "g", "", "h"};
    ArrayList<String> result = new ArrayList<>();
    for (String s : ss) {
      if (s.equals("")) {
        break;
      }
      result.add(s);
    }
    System.out.println(result.toString());
  }
}
