import java.util.HashMap;
import java.util.Map;

public class MapSample {
  public static void main(String[] args) {
    String[] sweets = {"ケーキ", "プリン", "アイス", "チョコレート"};
    Map<Integer, String> hashmap = new HashMap<Integer, String>();
    for (int i=0; i<sweets.length; i++) {
      hashmap.put(i+1, sweets[i]);
    }
    System.out.println("hashmap: "+hashmap);
    System.out.println("hashmap values: "+hashmap.values());
    for (String val : hashmap.values()) {
      System.out.print(val + " ");
    }
    System.out.println("");
    System.out.println("hashmap keys: "+hashmap.keySet());
    for (int key : hashmap.keySet()) {
      System.out.println(key + ":" + hashmap.get(key));
    }
    System.out.println("hashmap size: "+hashmap.size());
  }
}
