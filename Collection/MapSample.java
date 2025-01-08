import java.util.HashMap;
import java.util.Map;

public class MapSample {
  public static void main(String[] args) {
    String[] sweets = {"ケーキ", "プリン", "アイス", "チョコレート"};
    Map<Integer, String> map = new HashMap<Integer, String>();
    for (int i=0; i<sweets.length; i++) {
      map.put(i+1, sweets[i]);
    }
    System.out.println("map: "+map);
    System.out.println("map values: "+map.values());
    for (String val : map.values()) {
      System.out.print(val + " ");
    }
    System.out.println("");
    System.out.println("map keys: "+map.keySet());
    for (int key : map.keySet()) {
      System.out.println(key + ":" + map.get(key));
    }
    System.out.println("map size: "+map.size());
  }
}
