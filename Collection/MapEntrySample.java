import java.util.HashMap;
import java.util.Map;

public class MapEntrySample {
  public static void main(String[] args) {
    String[] colors = {"赤","緑","青","黄"};
    String[] codes = {"#ff0000","#00ff00","#0000ff","#ffff00"};
    Map<String, String> map = new HashMap<String, String>();
    for (int i=0; i<colors.length; i++ ) {
      map.put(colors[i],codes[i]);
    }
    for (Map.Entry<String,String> entry : map.entrySet()) {
      System.out.println(entry.getKey()+":"+entry.getValue());
    }
  }
}
