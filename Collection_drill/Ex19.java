import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class Ex19 {
  public static void main(String[] args) {
    Map<String,Double> m1 = new HashMap<>(Map.of("iPhone16",6.1,"iPhone16Pro",6.3,"iPhone16ProMax",6.9,"Pixel9",6.1));
    Map<String,Double> m2 = new HashMap<>(Map.of("iPhone15",6.1,"iPhone16",6.1,"Pixel9",6.1));
    Set<String> s1 = new HashSet<>(m1.keySet());
    Set<String> s2 = new HashSet<>(m2.keySet());
    s1.retainAll(s2);
    System.out.println(s1.toString());
    for (String key : s1) {
      System.out.println("key: "+key+", value: "+m1.get(key));
    }
    m1.putAll(m2);
    System.out.println(m1.toString());
  }
}
