import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class Ex19 {
  public static void main(String[] args) {
    Map<String,Double> m1 = new HashMap<>(Map.of("iPhone13",6.1,"iPhone13Pro",6.1,"iPhone13ProMax",6.7,"iPhoneSE",4.7));
    Map<String,Double> m2 = new HashMap<>(Map.of("iPhone12",6.1,"iPhone13",6.1,"iPhone12mini",5.4));
    Set<String> s1 = new HashSet<>(m1.keySet());
    Set<String> s2 = new HashSet<>(m2.keySet());
    s1.retainAll(s2);
    System.out.println(s1.toString());
    for (String key : s1) {
      System.out.println("key: "+key+"value: "+m1.get(key));
    }
    m1.putAll(m2);
    System.out.println(m1.toString());
  }
}
