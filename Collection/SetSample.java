import java.util.HashSet;
import java.util.Set;

public class SetSample {
  public static void main(String[] args) {
    String[] jsweets = {"大福", "団子", "まんじゅう", "おはぎ"};
    Set<String> set = new HashSet<String>();
    for (int i=0; i<jsweets.length; i++) {
      set.add(jsweets[i]);
    }
    set.add("大福"); // 重複した要素の追加
    System.out.println("set: "+set);
    System.out.println("set check: "+set.contains("団子"));
  }
}
