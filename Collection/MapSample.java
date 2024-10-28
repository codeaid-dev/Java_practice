import java.util.HashMap;

public class MapSample {
  public static void main(String[] args) {
    String[] sweets = {"ケーキ", "プリン", "アイス", "チョコレート"};
    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
    for (int i=0; i<sweets.length; i++) {
      hashmap.put(i+1, sweets[i]);
    }
    System.out.println("hashmap: "+hashmap.toString());
    System.out.println("hashmap: "+hashmap.values().toString());
    for (String val : hashmap.values()) {
      System.out.print(val + " ");
    }
    System.out.println("");
    System.out.println("hashmap: "+hashmap.keySet().toString());
    for (int key : hashmap.keySet()) {
      System.out.print(key + ":" + hashmap.get(key)+"/");
    }
    System.out.println("");
  }
}
