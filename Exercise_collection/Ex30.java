import java.util.HashMap;
import java.util.Map;

public class Ex30 {
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<>(Map.of("c1","red","c2","Green","c3","","c4","Blue"));
    HashMap<String,String> result = new HashMap<>();
    for (String key : map.keySet()) {
      if (!map.get(key).equals("")) {
        result.put(key,map.get(key));
      }
    }
    System.out.println(result.toString());
  }
}
