import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Ex32 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
//    String s = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    String[] ss = s.split(",");
    String[] left = ss[0].split("");
    String[] right = ss[1].split("");
    Set<String> left_set = new HashSet<>(List.of(left));//重複を考慮してList.ofを使う
    Set<String> right_set = new HashSet<>(List.of(right));//重複を考慮してList.ofを使う
    left_set.retainAll(right_set);
    String result = String.join("", left_set);
    System.out.println(result);
  }
}
