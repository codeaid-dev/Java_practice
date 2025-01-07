import java.util.HashMap;
import java.util.Map;

public class Ex28 {
  public static void main(String[] args) {
    char[] keys = {'a','b','c'};
    int[] values = {1,2,3};
    Map<Character,Integer> result = new HashMap<>();
    for (int i=0; i<keys.length; i++) {
      result.put(keys[i],values[i]);
    }
    System.out.println(result.toString());
  }
}
