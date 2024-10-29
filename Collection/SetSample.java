import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetSample {
  public static void main(String[] args) {
    String[] jsweets = {"大福", "団子", "まんじゅう", "おはぎ"};
    HashSet<String> hashset = new HashSet<String>();
    for (int i=0; i<jsweets.length; i++) {
      hashset.add(jsweets[i]);
    }
    hashset.add("大福"); // 重複した要素の追加
    System.out.println("hashset: "+hashset.toString());
    System.out.println("hashset check: "+hashset.contains("団子"));
  }
}
